package activity;
class Teacher{
	String college="SSS";
	String designation="Teacher";
	void work() {
}}
	class ITTeacher extends Teacher{
		
	}
	class MathTeacher extends Teacher{
		void work() {
			System.out.println(college+" "+designation);
		}
	}
	class MusicTeacher extends Teacher{
		void work() {
			System.out.println(college+" "+designation);
	}}
	class PhysicsTeacher extends Teacher{
		void work() {
			System.out.println(college+" "+designation);
	}}

public class Teacher1 {

	public static void main(String[] args) {
		MathTeacher mm=new MathTeacher();
		 MusicTeacher nn=new  MusicTeacher();
		 PhysicsTeacher pp=new PhysicsTeacher();
		 mm.work();
		 nn.work();
		 pp.work();

	}

}
