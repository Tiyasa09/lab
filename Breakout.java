package operator1;
import java.util.Scanner;

public class Breakout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gh=new Scanner(System.in);
		System.out.println("enter a five digit number");
		int a=gh.nextInt();
		int d1=a/10000%10;
		int d2=a/1000%10;
		int d3=a/100%10;
		int d4=a/10%10;
		int d5=a%10;
		System.out.println(d1+" "+d2+" "+d3+" "+d4+" "+d5);
		56748

	}

}
