package lab20thoct;
//problem 1
/*You are given a piece of Java code. You have to complete the code by writing down the handlers
for exceptions thrown by the code. The exceptions the code may throw along with the handler
message are listed below:
Division by zero: Print "Invalid division".
String parsed to a numeric variable: Print "Format mismatch".
Accessing an invalid index in string: Print "Index is invalid".
Accessing an invalid index in array: Print "Array index is invalid".
MyException: This is a user defined Exception which you need to create. It takes a
parameter param. When an exception of this class is encountered, the handler should print "My
Exception[param]", here param is the parameter passed to the exception class.
Exceptions other than mentioned above: Any other exception except the above ones fall in this
category. Print "Exception encountered".
Finally, after the exception is handled, print "Exception Handling Completed".*/

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
