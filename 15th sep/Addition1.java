package activity;

class Arithmatic{
	int add(int a,int b) { //add method
		return a+b; 
	}
}
class Adder extends Arithmatic{
void show() {
	super.add(5, 7);
}}

public class Addition1 {

	public static void main(String[] args) {
		Adder ad=new Adder();
		ad.add(5, 7);

	}}


