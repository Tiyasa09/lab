package operator1;
Q.2 Write a Java program to convert minutes into a number of years and
days

public class Yearsdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The minutes is:");
		long a=58853289;
		System.out.println(a);
		long b=a/60;
		System.out.println("The b is:"+b);
		long c=b/24;
		System.out.println("The c is:"+c);
		long year=c/365;
		System.out.println("The year is:"+year);
		long days=c%365;
		System.out.println("The days is:+days");

	}

}
