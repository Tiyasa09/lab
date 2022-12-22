package com.CMS.daoImpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.CMS.Util.ClgUtil;
import com.CMS.dao.ClgDao;
import com.CMS.entity.ClgUser;

public class ClgImpl implements ClgDao{
	public void addStudent() {
		Session session=ClgUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		int id;
		String fn,ln,email,addr,course;
		 long phone,reg;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter student id:");
		 id=sc.nextInt();
		 System.out.println("Enter your first name:");
		 fn=sc.next();
		 System.out.println("Enter your last name:");
		 ln=sc.next();
		 System.out.println("Enter your email:");
		 email=sc.next();
		 System.out.println("Enter your address:");
		 addr=sc.next();
		 System.out.println("which course do you want to admit?");
		 course=sc.next();
		 System.out.println("Enter your phone number:");
		 phone=sc.nextLong();
		 System.out.println("Enter your registration number:");
		 reg=sc.nextLong();
		 ClgUser cu=new ClgUser();
		 cu.setId(id);
		 cu.setFirstName(fn);
		 cu.setLastName(ln);
		 cu.setEmail(email);
		 cu.setAddress(addr);
		 cu.setCourse(course);
		 cu.setPhone(phone);
		 cu.setRegistration(reg);
		 session.save(cu);
		 t.commit();
		 System.out.println("Congratulation!! \nYou are admitted to this college");
		 session.close();
		 }
	public void readStudent() {
			Session session = ClgUtil.getSessionFactory().openSession();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student id: ");
			int id = sc.nextInt();
			ClgUser w =session.get(ClgUser.class,id);
			System.out.println("Id :" +w.getId() +"\nName :" + w.getFirstName()+" "+w.getLastName()+"\nEmail : "+w.getEmail()+"\nAddress : "+w.getAddress()+"\nCourse : "+w.getCourse()+"\nphone no: "+w.getPhone()+"\nRegistration number: "+w.getRegistration());
			session.close();
	}
	public void updateStudent() {
		Session session = ClgUtil.getSessionFactory().openSession();
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();
		System.out.println("Enter Student id : ");
		int j = s.nextInt();
		ClgUser w = session.get(ClgUser.class,j);
		System.out.println("Which one you wish to update? \nEmail/Address/Phone");
		String ans=s.next();
		if(ans== "email" || ans=="Email") {
		System.out.println("Enter your Updated email : ");
		String eml = s.next();
		w.setEmail(eml);
		session.update(w);
		t.commit();
		System.out.println("Updated successfylly");
		session.close();
		}
		else if(ans=="address" || ans=="Address") {
			System.out.println("Enter your Updated address : ");
			String add = s.next();
			w.setAddress(add);
			session.update(w);
			t.commit();
			System.out.println("Updated successfylly");
			session.close();
		}
		else if(ans=="phone" || ans=="Phone") {
			System.out.println("Enter your Updated phone number : ");
			long ph = s.nextLong();
			w.setPhone(ph);
			session.update(w);
			t.commit();
			System.out.println("Updated successfylly");
			session.close();
		}else
			System.out.println("Wrong choice");
		session.close();
		/*session.update(w);
		t.commit();
		System.out.println("Updated successfylly");
		session.close();*/
	}
	public void deleteStudent() {
		Session session = ClgUtil.getSessionFactory().openSession();
		Scanner s = new Scanner(System.in);
		Transaction t = session.beginTransaction();
		System.out.println("Enter user id : ");
		int k = s.nextInt();
		ClgUser w = session.get(ClgUser.class, k);
		session.delete(w);
		t.commit();
		System.out.println("Deleted successfylly");
		session.close();
	}

}
