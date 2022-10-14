package activity;
//Class A serves as a base class for the derived class B, which in turn
//serves as a base class for the derived class C. (Which type Of Inheritance
//explain with an example)
//this is an hierarchical inheritance
class A{
	void A() { //base class
		System.out.println("it is raining");
	}
}
class B extends A{ //1st child class of parent class
	void B() {
		System.out.println("it is not raining");
	}
}
class C extends A{ //2nd child class of parent class
	void C() {
		System.out.println("it may be raining");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		B bb=new B(); //creating object of class B
		bb.B(); //calling void by object name
		bb.A(); //calling void by object name
		C cc=new C(); //creating object of class 
		cc.C(); //calling void by object name
		cc.A(); //calling void by object name
		 
		

	}

}
