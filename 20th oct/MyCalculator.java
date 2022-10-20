package lab20thoct;
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
