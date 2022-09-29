package lab29th;
//Write a Java program to find common elements from three sorted (in
//non-decreasing order) arrays.
public class CommonElement {
	void commonElement(int a1[],int a2[],int a3[]) {
		int i=0,j=0,k=0;
		while(i<a1.length && j<a2.length && k<a3.length) {
			if(a1[i]==a2[j] && a2[j]==a3[k]) {
				System.out.println(a1[i]+" ");
				i++;
				j++;
				k++;
				}
			else if(a1[i] < a2[j])
				i++;
			else if(a2[j] < a3[k])
				j++;
			else
				k++;
			}
		}
	public static void main(String[] args) {
		CommonElement ss= new CommonElement();                                           
		int[] a1= {2,4,6,7,9,13};
		int[]a2= {3,8,9,13,17};
		int[] a3= {4,9,14,20};
		System.out.println("common elements are:");
		ss.commonElement(a1, a2, a3);
	}
	

}
