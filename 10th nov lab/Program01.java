package lab10thnov;
//Write a Java program to read first 3 lines from a file

import java.io.*; //import package
 public class Program01 {
  public static void main(String args[]){//main method
        String str = " ";//String variable
        try {//try block
            LineNumberReader ln = new LineNumberReader(new InputStreamReader(new FileInputStream("D:\\text.txt")));//specify text file
             while (((str = ln.readLine()) != null) && ln.getLineNumber() <= 3){//condition for read 3 lines
                System.out.println(str);
            }
           ln.close();//closing
        } catch (Exception e) {//catch block
            System.out.println(e);
        }
     }
}
