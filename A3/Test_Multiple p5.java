/*Create two interfaces Printable and Showable having methods print( ) and show( )
respectively.Create a Test_Multiple class which implements all 2 interfaces and
override print( ) and show( ) methods. Write a main method in this class and create an
object of this class and use the methods.*/
interface printable
{
	void print();
}
interface showable
{
	void show();
}
class Test_Multiple p5 implements printable,showable
{
	public void print()
	{
		System.out.println("Printing...");
	}
	public void show()
	{
		System.out.println("showing...");
	}
	public static void main(String args[])
	{
		Test_Multiple t1 = new Test_Multiple();
		t1.print();
		t1.show();
	}
}