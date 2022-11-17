package nov17thlab;
//Write a Java program to compare two array lists
import java.util.ArrayList;

public class Problem3 {
	public static void main(String[] args) {
		//create 1st array list
		ArrayList<Integer> a=new ArrayList<Integer>();
		//add elements
		a.add(4);
		a.add(6);
		a.add(8);
		a.add(10);
		a.add(12);
		System.out.println("1st list: "+a);
		//create 2nd list
		ArrayList<Integer> a1=new ArrayList<Integer>();
		//add elements
		a1.add(4);
		a1.add(6);
		a1.add(8);
		a1.add(11);
		a1.add(12);
		System.out.println("2nd list: "+a1);
		ArrayList<String> a2 = new ArrayList<String>();
	     for (Integer i : a1)  //using for each loop
	       a2.add(a.contains(i) ? "Yes" : "No");
	     System.out.println(a2);  //printing the output   
	     
		
	}

}
