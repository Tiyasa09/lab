package com.BookStore;

import java.util.Scanner;

import com.BookStore.daoimpl.BookImpl;

public class BookTest {
	public static void main(String[] args) {
		BookImpl bi = new BookImpl();
		char ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Book Store");
		do {
		System.out.println("Enter choice");
		System.out.println(" 1. Add new book \n 2. Read book \n 3. Exit");
		int ch = sc.nextInt();
		switch(ch) {
		case 1 :
			bi.addBook();
			break;
		case 2 :
			bi.readBook();
			break;
		case 3 :
			System.out.println("Thank You");
			System.exit(0);
		default :
			System.out.println("Invalid Choice");
			break;
		}
		System.out.println("Do you want to do the process again? Y/N");
		ans = sc.next().charAt(0);
		} while (ans == 'y' || ans == 'Y');
		System.out.println("Thank You");
		}
	}


