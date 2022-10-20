package lab20thoct;
import java.util.Scanner;
class ChildAge extends Exception{
	ChildAge(String s){
		super(s);
	}
}

public class CustomException {
	 static void check(int age) throws ChildAge{
		if(age<3) {
			throw new ChildAge("not eligible for Kidzee");
		}else if(age>=3 || age<=5) {
			throw new ChildAge("eligible for Kidzee");
		}else if(age>5) {
			throw new ChildAge("eligible for School");
		}
	}
	public static void main(String[] args) throws ChildAge {
		CustomException p=new CustomException();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age between 1 to 10");
		while(sc.hasNextInt()) {
			try {
		int age=sc.nextInt();
		p.check(age);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

}}}
