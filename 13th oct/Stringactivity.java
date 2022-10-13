package lab13thoct;
import java.util.StringTokenizer;

//problem statement1

public class Stringactivity {
	public static void main(String[] args) {
	String s="Welcome to Java World";  //1st string
	System.out.println("original:" +s);
	System.out.println("5th position:" +s.charAt(5));  //print position 5
    String s1="Welcome"; //2nd string
    int result=s.compareToIgnoreCase(s1);  //using comparetoignore case for 1st and 2nd string
    if(result<0) {   //decision making for compare
    	System.out.println("\""+s+"\""+"is less than"+"\""+s1+"\"");
    }else if(result==0) {
    	System.out.println("\""+s+"\""+"is equal to"+"\""+s1+"\"");
    }else {
    	System.out.println("\""+s+"\""+"is greater than"+"\""+s1+"\"");
    }
   s= s.concat("Let us Learn");  //after concatenation
   System.out.println("new:" +s);
  s= s.replace('a','e');//replace
   System.out.println("after replace:" +s);
   System.out.println(s.substring(4, 10));
   System.out.println(s.toLowerCase());
   
   //problem statement 2

	 StringBuffer s3=new StringBuffer("This is StringBuffer"); //using stringbuffer class
	 s3.append("This is sample program");
	 System.out.println("String:" +s3);
	 s3.insert(21, "object");//insert
	 System.out.println("after insert:" +s3);
	 s3.replace(14, 20, "Builder");//replace
	 System.out.println(s3);
	 s3.reverse();//reverse
	 System.out.println("reverse:"+s3);
	 
	 //problem statement 3
	 
	 StringTokenizer s4=new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE"); //using tokenizer
	 while(s4.hasMoreTokens())
		 System.out.println(s4.nextToken("\\"));
	 
 }
}
