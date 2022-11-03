package lab03rdnov;
//wrapper class assignment
//problem statement 1
public class Student {
	//Parameterized method 1
	void calculateFeesStructure(Long studentId,Character studentGrade,Double monthlyFees,Boolean isScholarshipEligible) {
		if(studentId!=0 && studentGrade=='A' && isScholarshipEligible==true) { //condition 1
			int Fees=(int) (monthlyFees-monthlyFees*10/100);
			System.out.println("10% 0f fees is exempted,the calculated fees is "+Fees);
		}else if(studentId!=0 && studentGrade=='B' && isScholarshipEligible==true) { //condition 2
			int Fees=(int) (monthlyFees-monthlyFees*8/100);
			System.out.println("8% 0f fees is exempted,the calculated fees is "+Fees);
	}else if(studentId!=0 && studentGrade=='C' && isScholarshipEligible==true) { //condition 3
		 int Fees=(int) (monthlyFees-monthlyFees*6/100);
		System.out.println("6% 0f fees is exempted,the calculated fees is "+Fees);
	}else if(studentId!=0 && studentGrade=='D' && isScholarshipEligible==true) { //condition 4
		int Fees=(int) (monthlyFees-monthlyFees*4/100);
		System.out.println("4% 0f fees is exempted,the calculated fees is "+Fees);
    }else { //or
    	System.out.println("Not Eligible for Exemption");
    }
}
	//problem statement 2
	//Parameterized method 2
	void compareMarks(Long Maths,Double English) {
		int maths=Maths.intValue();//type casting
		int english=English.intValue();//type casting
		if(English>Maths) { //1st condition
			System.out.println("English mark is higher than Maths");
		}else if(Maths>English) { //2nd condition
			System.out.println("Maths mark is higher than English");
		}else {
			System.out.println("both are equal");
		}
	}
	//problem statement 3
	////Parameterized method 3
	void validateFees(Double Fees) {
		if(Fees.isInfinite()) {
			System.out.println("Fees is infinite");
		}else {
			System.out.println("fees is not infinite");
		}
		byte fees;
		System.out.println( fees=Fees.byteValue());
		
	}
	public static void main(String[] args) {
		Student s=new Student(); //object of student class
		//calling method 1
		System.out.println("problem 1");
		System.out.println("test case 1");
		s.calculateFeesStructure((long)234, 'C', 600.00, true);//passing value 
		System.out.println("test case 2");
		s.calculateFeesStructure((long)115, 'B', 909.50, true);//passing value
		System.out.println("test case 3");
		s.calculateFeesStructure((long)980, 'G', 1810.00, false);//passing value
		//calling method 2
	    System.out.println("problem 2");
	    System.out.println("test case 1");
	      s.compareMarks((long)65, (double)85);//passing value
	      System.out.println("test case 2");
	      s.compareMarks((long)98, (double)56);//passing value
	      System.out.println("test case 3");
	      s.compareMarks((long)84, (double)84);//passing value
	      //calling method 3
	      System.out.println("problem 3");
	      s.validateFees((double) 100);
	      
	}}