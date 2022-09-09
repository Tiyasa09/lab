package lab08th;

import object.Cc;

class Employeee{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance;
	double hra;
	void Employeee(long id,String name,String address,long phone,double salary) {
		employeeId=id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
		basicSalary=salary;
		specialAllowance=250.80;
		hra=1000.50;
	}
	void calculateSalary() {
		double salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
		System.out.println("Employee's salary is:"+salary);
	}
	class Inheritance {
public static void main(String[] args) {
	Manager ab=new Manager();
	Trainee ac=new Trainee();
	ab.main(args);
	ac.main(args);
}
}}
   

		
