package lab10th;
//Write a Java program to test if an array contains a specific value
public class ContainValue {

	public static void main(String[] args) {   //main method
		int[] a= {2,4,6,8,10};   //initialize array
		int toFind=6;     //to find a number in array
		boolean b = false;
		for(int i:a) {
	
			if(i==toFind) {
				b=true;
			}
		}
		if(b)
			System.out.println("true");
		else
		System.out.println("false");

	}

}
