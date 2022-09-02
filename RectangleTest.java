package operator1;

class Rectangle{
	int length;
	int breadth;
	 Rectangle(int l,int b){
		length=l;
		breadth=b;
	}
	void area() {
		int area=length*breadth;
		System.out.println("area:"+area);
	}
	 class RectangleTest {
     public static void main(String[] args) {
    	 Rectangle ac=new Rectangle(23,12);
    	 Rectangle ac1=new Rectangle(13,7);
    	 ac.area();
    	 ac1.area();
     }}}


