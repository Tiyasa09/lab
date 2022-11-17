package nov17thlab;
//Write a Java program to insert the specified element at the front of a linked list
import java.util.LinkedList;

public class Problem4 {
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
		a.offerFirst("purple");//insert element at 1st
		System.out.println("new list: " +a);

}
}