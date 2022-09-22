package lab;

public class Calculator {
	 int addition(int a,int b) {
		return a+b;
	}
	 int subtraction(int a,int b) {
		 return a-b;
	 }
	 int multiplication(int a,int b) {
		 return a*b;
	 }
	 void show() {
		 
	 }
	 public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.addition(5, 7));
		System.out.println(c.subtraction(7, 5));
		System.out.println(c.multiplication(7, 5));
	
	}

	
	
}
