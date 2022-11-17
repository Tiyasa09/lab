package nov17thlab;
/*1. Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store
even numbers from 2 to N, where N is a integer which is passed as a parameter to the
method storeEvenNumbers(). The method should return the ArrayList (A1) created.
2. In the same class create a method printEvenNumbers()which iterates through the
arrayList A1 in step 1, and It should multiply each number with 2 and display it in format
4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2)
created needs to be returned.
3. Create a method retrieveEvenNumber(int N) parameter is a number N. This method
should search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it
should return the Number else return zero.
Hint: Use instance variable for storing the ArrayList A1 and A2.
NOTE: You can test the methods using a main method.*/
import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
   ArrayList<Integer> A1 = new ArrayList<Integer>();
	  ArrayList<Integer> saveEvenNumbers(int N) {
		A1 = new ArrayList<Integer>();
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) {
				A1.add(i);
			System.out.println(i);
		}}
		return A1;
	}
	 ArrayList<Integer> printEvenNumbers() {
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		for (int i:A1) {
			A2.add(i*2);
			System.out.println(i*2);
		}
		return A2;
	}
	 ArrayList<Integer> retrieveEvenNumber(int N){
		 return A1;
	 }
 public static void main(String[] args) {
		Problem1 p = new Problem1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of N");
		p.saveEvenNumbers(sc.nextInt());
		p.printEvenNumbers();
 }
}
