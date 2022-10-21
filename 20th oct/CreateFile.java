package lab20thoct;
//Write a program in Java to create a file in Java using Exception Handling

	import java.io.File;   //importing file class
	import java.io.IOException;   //importing IO Exception class
	public class CreateFile {
	    public static void main(String args[])
	        {
	            try {
	                File n = new File("C:\\Users\\File Handling\\NewFile.txt");   //initialize File object and passing path as argument
	                if (n.createNewFile()) {  //creating new file and checking condition
	                    System.out.println("File " + n.getName() + " is created successfully.");
	                }
	                else {
	                    System.out.println("File is already exist");
	                }
	            } catch (IOException e) {  //catching exception if any exception occurs
	                System.out.println("An unexpected error is occurred.");
	                e.printStackTrace();  //printing the exception message

	        }
	    }}


