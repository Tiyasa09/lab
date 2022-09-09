package lab08th;

 class Employee1 {
	long empid;
	String empname;
	void Employee1(long id,String name) {
		empid=id;
		empname=name;
	}
	void show() {
		System.out.println(empid+" "+empname);
	}
	
  class Employee{
	public static void main(String[] args) {
		Employee1 cc=new Employee1();
		Employee1 cc1=new Employee1();
		Employee1 cc2=new Employee1();
		Employee1 cc3=new Employee1();
		Employee1 cc4=new Employee1();
		cc.Employee1(12345, "akash");
		cc1.Employee1(12346, "meghla");
		cc2.Employee1(12347, "papai");
		cc3.Employee1(12348, "sanjukta");
		cc4.Employee1(12349, "subhra");
		cc.show();
		cc1.show();
		cc2.show();
		cc3.show();
		cc4.show();
	}}}
