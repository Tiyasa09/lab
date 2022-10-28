package lab28thoct;
//Create two threads to print even numbers and odd numbers from 1 to 100?
//note: after printing of all even numbers only odd numbers should print

class Thread1 extends Thread{ //extend thread class
	public void run() {// run method
		System.out.println("even numbers are");
		for(int i=1;i<=100;i++) {//for loop for 1-100
			if(i%2==0) {//if for even number
			System.out.println(i);
		}
			}
	}
}
class Thread2 extends Thread{//extend thread class
	public void run() {//run method
		System.out.println("odd numbers are");
		for(int i=1;i<=100;i++) {//for loop for 1-100
			if(i%2!=0) {//if for odd num
			System.out.println(i);
		}
			}
	}
}
public class Problem1 {
public static void main(String[] args) {
		Thread1 t1=new Thread1();//creating object of Thread1 class
		t1.start();// start the thread1
		try { //try block
			t1.join();//waiting
		} catch (InterruptedException e) {//catch block
			System.out.println(e);;//printing the Exception
		}
		Thread2 t2=new Thread2();////creating object of thread2
		t2.start();// start the thread2


	}

}
