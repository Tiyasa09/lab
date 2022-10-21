package lab20thoct;
//Write a program in Java to create a file in Java using Exception Handling

	import java.io.File;   //importing file class
	import java.io.IOException;   //importing IO Exception class
	public class CreateFile {
	    public static void main(String args[])
	        {
	            try {
	                File n = new File("C:\\Users\\File Handling\\NewFile.txt");   //initialize File object and passing an argument
	                if (n.createNewFile()) {  // check condition
	                    System.out.println("File " + n.getName() + " is created successfully.");
	                }
	                else {
	                    System.out.println("File is already exist");
	                }
	            } catch (IOException e) {  //catch block
	                System.out.println("An unexpected error is occurred.");
	                e.printStackTrace();  //print message

	        }
	    }}


