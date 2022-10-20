package lab20thoct;
//problem 1
class MyException extends Exception{ //create MyException class of Exception
	MyException(String param){ //Parameterized
		super(param);
	}
}
public class Problem1  {
	public static void main(String[] args) throws MyException {
		try { //1st try block for Arithmetic exceotion
			int a=10/0;
			System.out.println(a);
		}catch(ArithmeticException p) {
			System.out.println("Invalid division");
		}
		try { //1st try block for formatmismatch exceotion
			String s="tiyasa";
			int b=Integer.parseInt(s);
			System.out.println(b);
		}catch(NumberFormatException n) {
			System.out.println("Format mismatch");
		}
		try { //1st try block for Array indexoutofbound exceotion
			int t[]=new int[3];
			t[5]=32;
		}catch(IndexOutOfBoundsException z) {
			System.out.println("Array index is invalid");
		}
		try { //1st try block for invalidindexinstring exceotion
			String d=null;
			System.out.println(d.length());
		}catch(NullPointerException n) {
			System.out.println("Index is invalid");
		}catch(Exception f) {
			System.out.println("Exception encountered");
			System.out.println("MyException[param]");
		}
		System.out.println("exception handling completed");
		
		
	}

}
