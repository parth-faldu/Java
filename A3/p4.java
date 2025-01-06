abstract class shape
{
	abstract void draw();
}
class rectangle extends shape
{
	void draw()
	{
		System.out.println("rectangle");
	}
}
 class circle extends shape
 {
	 void draw()
	 {
		 System.out.println("circle");
	 }
 }
 class p4
 {
	 public static void main(String args[])
	 {
		shape s;
		rectangle r1 = new rectangle();
		circle c1 = new circle();
		s=r1;
		s.draw();
		s=c1;
		s.draw();
	 }
 }