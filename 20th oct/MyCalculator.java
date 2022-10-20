package lab20thoct;
/*Create a class MyCalculator which consists of a single method long power(int, int).
This method takes two integers, n and p, as parameters and finds n^p . If either n or
p is negative, then the method must throw an exception which says "n or p should
not be negative.". Also, if both n and p are zero, then the method must throw an
exception which says "n and p should not be zero."*/

import java.util.Scanner;

 class MyCalculator1 {
	static long power(int n,int p) throws Exception {  //create method 
		if(n<0 || p<0) { //condition 1
			throw new Exception("n or p should not be negative");
		}else if(n==0 && p==0) { //condition 2
			throw new Exception("n and p should not be zero");
		}else {
		return (long) (Math.pow(n, p));
	}}
 }
 class MyCalculator{
	public static void main(String[] args) {
		MyCalculator1 m=new MyCalculator1();
		Scanner s=new Scanner(System.in); //scanner class
		System.out.println("enter two value"); 
		while(s.hasNextInt()) { //take more input
		int n=s.nextInt(); //1st input
		int p=s.nextInt(); //2nd input
		try {
			System.out.println(m.power(n, p));
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}}
