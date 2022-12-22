package com.CMS;

import java.util.Scanner;

import com.CMS.daoImpl.ClgImpl;

public class ClgTest {
	public static void main(String[] args) {
		ClgImpl ci = new ClgImpl();
		char ans;
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to user record system");
		do {
		System.out.println("Enter choice");
		System.out.println(" 1. Add new student \n 2. Read \n 3. Update \n 4. Delete \n 5. Exit");
		int ch = s.nextInt();
		switch(ch) {
		case 1 :
			ci.addStudent();
			break;
		case 2 :
			ci.readStudent();
			break;
		case 3 :
			ci.updateStudent();
			break;
		case 4 :
			ci.deleteStudent();
			break;
		case 5 :
			System.out.println("Thank You");
			System.exit(0);
			break;
		default :
			System.out.println("Invalid Choice");
			break;
		}
		System.out.println("Do you want to do the process again? ");
		ans = s.next().charAt(0);
		} while (ans == 'y' || ans == 'Y');
		System.out.println("Thank You");
		}
	}


