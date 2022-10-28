package lab28thoct;
//Take two numbers x and y. Throw the exception if the two numbers are
//negative else print the
//Product of x and y.

import java.util.Scanner; //import scanner class

public class Problem2 {
	public static void main(String[] args) throws Exception {
		try { //try block
			Scanner s=new Scanner(System.in); //object of scanner class
			System.out.println("enter two numbers");
			while(s.hasNextInt()) { //more tokens
			int x=s.nextInt(); //taking 1st input
			int y=s.nextInt(); //taking 2nd input
			if(x<0 || y<0) { //condition
				throw new Exception("x and y should not be zero");
			}else {
				 System.out.println("product" +" "+(x*y));
			}
			}
		}catch(Exception e) { //catch block
			System.out.println(e);
		}
	}

}
