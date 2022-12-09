package lab8thdec;

//problem statement 1
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
	//creating arraylist
   ArrayList<Integer> A1 = new ArrayList<Integer>();
	  ArrayList<Integer> saveEvenNumbers(int N) { //1st method
		A1 = new ArrayList<Integer>();
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) {  //condition for even
				A1.add(i);
			System.out.println(i);
		}}
		return A1;
	}
	 ArrayList<Integer> printEvenNumbers() {  //2nd method
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		for (int i:A1) {
			A2.add(i*2);
			System.out.println(i*2);
		}
		return A2;
	}
	 ArrayList<Integer> retrieveEvenNumber(int N){  //3rd method
		 return A1;
	 }
 public static void main(String[] args) { //main method
		Problem1 p = new Problem1(); //creating object of class
		Scanner sc=new Scanner(System.in); //creating scanner class object
		System.out.println("enter value of N");
		System.out.println("1st result: " +p.saveEvenNumbers(sc.nextInt())); //1st method calling
		System.out.println("2nd result: " +p.retrieveEvenNumber(sc.nextInt()));  //2nd method calling
		System.out.println("3rd result: " +p.printEvenNumbers());  //3rd method calling
 }
}
