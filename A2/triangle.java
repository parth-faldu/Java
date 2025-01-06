import java.util.*;
class triangle
{
	float base;
	double height;
	
	Scanner sc = new Scanner(System.in);
	
	triangle()
	{	
		System.out.print("Enter Base:");
		base = sc.nextFloat();
		
		System.out.print("Enter Height:");
		height = sc.nextDouble();
	}
	
	triangle(float b,double h)
	{
		base = b;
		height = h;
	}
	void calcArea()
	{
		System.out.println("\nBase:"+base);
		System.out.println("Height:"+height);
	}
}
class triangledemo
{
	public static void main(String args[])
	{
		triangle t1 = new triangle();
		triangle t2 = new triangle(2.5f,5);
		
		t1.calcArea();
		t2.calcArea();
	}
}