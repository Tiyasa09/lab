package nov17thlab;
//Write a Java program to extract a portion of an array list.
import java.util.ArrayList;
import java.util.List;

public class Problem2 {
	public static void main(String[] args) {
		//create array list
		ArrayList<String> a=new ArrayList<String>();
		//add elements
		a.add("red");
		a.add("blue");
		a.add("black");
		a.add("white");
		a.add("pink");
		System.out.println(a);
		List<String> a1= a.subList(1, 3);//extract from 1 to 3 position
		System.out.println("new list: " +a1);
	}
}
