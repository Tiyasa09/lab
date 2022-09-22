package lab;
import java.util.Scanner;

public class Sumodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of num:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
		sum=sum+i;
			}}
			System.out.println("The sum of odd numbers is:"+sum);
		}
	}
