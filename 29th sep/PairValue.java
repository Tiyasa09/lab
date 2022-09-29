package lab29th;
//a Java program to find all pairs of elements in an array whose sum is
//equal to a specified number

public class PairValue {
	public static void main(String[] args) {
		pairValue(new int[] {3,2,5,4,7,6,8,11},9);
			
		}
	private static void pairValue(int[] a, int b) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==b) {
					System.out.println(a[i]+"+"+a[j]+"="+b);
				}
			}
		}
		
		
	}

}
