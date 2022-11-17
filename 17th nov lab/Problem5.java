package nov17thlab;
//Write a Java program to replace an element in a linked list

import java.util.LinkedList;

public class Problem5 {
	public static void main(String[] args) {
		//create linked list
		LinkedList<String> a=new LinkedList<String>();
		//add elements
		a.add("red");
		a.add("blue");
		a.add("black");
		a.add("white");
		a.add("pink");
		System.out.println(a);
		a.set(2, "purple");//replacing element in index position 2
		System.out.println("new list: " +a);
	}

}
