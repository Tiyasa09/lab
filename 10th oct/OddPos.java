package lab10th;
//we need to print the elements of the array which are present in odd positions. This can
//be accomplished by looping through the array and printing the elements of an array by
//incrementing i by 2 till the end of the array is reached.

public class OddPos {

	public static void main(String[] args) {   //main method
	
		int[] a= {11,12,13,14,15,16,17};   //initialize array
		System.out.println(" present in odd position:");
		for(int i=0;i<a.length;i=i+2) {   //for loop for finding element in odd position
			System.out.println(a[i]);
		}

	}

}
