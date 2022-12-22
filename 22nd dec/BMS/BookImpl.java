package com.BookStore.daoimpl;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.BookStore.dao.bookDao;
import com.BookStrore.entity.BookUser;

import com.BookStore.util.*;


public class BookImpl implements bookDao {
	public void addBook() {
		Session session = BookUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		int id;
		String author,title;
		double price;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id of the book: ");
		id=sc.nextInt();
		System.out.println("Enter Title of the book: ");
		title = sc.next();
		System.out.println("Enter Author's name: ");
		author = sc.next();
		System.out.println("Enter price ");
	    price = sc.nextDouble();
		BookUser u = new BookUser();
		u.setBookId(id);
		u.setTitle(title);
		u.setAuthor(author);
		u.setPrice(price);
		session.save(u);
		t.commit();
		System.out.println("Book record updated successfully");
		session.close();
	}
	public void readBook() {
		Session session = BookUtil.getSessionFactory().openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id of book ");
		int id = sc.nextInt();
		BookUser w =session.get(BookUser.class,id);
		System.out.println("Id :" +w.getBookId()+"Title :" + w.getTitle()+"Author : "+w.getAuthor()+"Price: "+w.getPrice());
		session.close();
	}

}
