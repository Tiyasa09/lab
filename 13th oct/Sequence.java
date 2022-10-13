package lab13thoct;
//Write a Java program to find sequences of lowercase letters joined with a underscore.

import java.util.regex.Pattern;

public class Sequence {
	public static void main(String[] args) {
		
	//String s1="java_exercise";
	boolean b1=Pattern.matches("[a-z]+_[a-z]+", "java_exercise");
	System.out.println(b1);
	boolean b2=Pattern.matches("[a-z]+_[a-z]+", "Java_Exercise");
	System.out.println(b2);
	}

}
