package lab29th;
//Write a Java method to check whether every digit of a given integer
//is even. Return true if every digit is odd otherwise false?
import java.util.Scanner;

public class DigitEvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer:");
		int i=sc.nextInt();
		System.out.println(test(i));
		
	}

	private static boolean test(int i) {
		if(i==0) {
			return false;
		}
		while(i!=0) {
			if((i%10)%2!=0) {
				return true;
			}else {
		        return false;
	}}
		return true;

}}
