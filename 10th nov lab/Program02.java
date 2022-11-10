package lab10thnov;
//Q.3 Write a Java program to find the longest word in a text file
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Program02 {
     public static void main(String [ ] args) throws FileNotFoundException {
              findLongestWords();
         }

     public static String findLongestWords() throws FileNotFoundException {

       String longestword = "";
       String s;
       Scanner sc = new Scanner(new File("D:\\text.txt"));


       while (sc.hasNext()) {//while loop
          s = sc.next();
           if (s.length() > longestword.length()) {
             longestword = s;
           }

       }
         System.out.println("logest word: " +longestword);
            return longestword;
            }
}


