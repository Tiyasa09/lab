package activity;
class Bank{
	float getInterest() {
		return 0.0f;
	}
	}
class SBI extends Bank{
	float getInterest() {
		return 8.0f;
	
	}
}
class ICICI extends Bank{
	float getInterest() {
		return 7.0f;
	}
}
class AXIS extends Bank{
	float getInterest() {
		return 9.0f;
	}
}
public class Bankrate {

	public static void main(String[] args) {
		SBI ss=new SBI();
		System.out.println("SBI bank's rate is:"+ss.getInterest()+"%");
		ICICI ii= new ICICI();
		System.out.println("ICICI bank's rate is:"+ii.getInterest()+"%");
		AXIS aa=new AXIS();
		System.out.println("AXIS bank's rate is:"+aa.getInterest()+"%");
		

	}

}
