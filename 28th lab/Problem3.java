package lab28thoct;
//Write a method called addTwoPositive that takes two int
//parameters, and if either value is not positive, throw an
//ArithmeticException, passing the string "Non-positive
//integer sent". to the constructor of the exception.if the
//values are both positive, then return the sum of them.
//Under what curcumstances will the finally code block be
//executed in a try/catch/finally segments.
import java.util.Scanner;
class ArithmeticExtion extends Exception{//extends exception class
	ArithmeticExtion(String s){ //Parameterized cons
		super("Non-positive integer sent");
	}
}

 class Problem3 {
	int addTwoPositive(int a,int b) throws ArithmeticException { //method with int parameter
			 if(a<0 || b<0) { //condition
				 throw new ArithmeticException("a and b should not be negative");
				 
			 }else {
				return a+b;
			 }}
	public static void main(String[] args) {
		Problem3 p=new Problem3(); //object of class
			Scanner s=new Scanner(System.in); //object of scanner class
			System.out.println("enter two numbers");
			int a=s.nextInt();//1st input
			int b=s.nextInt();//2nd input
			try {//try block
			System.out.println(p.addTwoPositive(a, b));
			 }catch(Exception e) {//catch block
			System.out.println(e);;
		}finally {//final block
			System.out.println("executed");
		}}
	}


