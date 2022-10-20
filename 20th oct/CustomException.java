package lab20thoct;
//Write a program to create custom exception in java

import java.util.Scanner;
class ChildAge extends Exception{ //create customException class
	ChildAge(String s){ //parameterized cons
		super(s);
	}
}

public class CustomException {
	 static void check(int age) throws ChildAge{ //create method
		if(age<3) { //1st condition
			throw new ChildAge("not eligible for Kidzee");
		}else if(age>=3 && age<=5) { //2nd condition
			throw new ChildAge("eligible for Kidzee");
		}else { //or
			System.out.println("eligible for school");
		}
	}
	public static void main(String[] args) throws ChildAge {
		CustomException p=new CustomException(); //create object 
		Scanner sc=new Scanner(System.in); //scanner class
		System.out.println("enter age between 1 to 10");
		while(sc.hasNextInt()) { //take more input
			try { //try block
		int age=sc.nextInt(); //taking input for age
		p.check(age); //method calling
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

}}}
