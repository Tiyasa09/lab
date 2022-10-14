package activity;
class Bank{ //parent class
	float getInterest() {  //method getinterest
		return 0.0f;//return value
	}
	}
class SBI extends Bank{ //1st child class
	float getInterest() {
		return 8.0f;
	
	}
}
class ICICI extends Bank{ //2nd child class
	float getInterest() {
		return 7.0f;
	}
}
class AXIS extends Bank{ //3rd method
	float getInterest() {
		return 9.0f;
	}
}
public class Bankrate {

	public static void main(String[] args) {
		SBI ss=new SBI(); //creating object of sbi class
		System.out.println("SBI bank's rate is:"+ss.getInterest()+"%");
		ICICI ii= new ICICI(); //creating object of icici bank
		System.out.println("ICICI bank's rate is:"+ii.getInterest()+"%");
		AXIS aa=new AXIS(); //creating object of axis class
		System.out.println("AXIS bank's rate is:"+aa.getInterest()+"%");
		

	}

}
