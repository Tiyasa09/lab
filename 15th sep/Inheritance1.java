package activity;
//Class A serves as a base class for the derived class B, which in turn
//serves as a base class for the derived class C. (Which type Of Inheritance
//explain with an example)
//this is an hierarchical inheritance
class A{
	void A() {
		System.out.println("it is raining");
	}
}
class B extends A{
	void B() {
		System.out.println("it is not raining");
	}
}
class C extends A{
	void C() {
		System.out.println("it may be raining");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		B bb=new B();
		bb.B();
		bb.A();
		C cc=new C();
		cc.C();
		cc.A();

	}

}
