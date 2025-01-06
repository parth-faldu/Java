import java.util.*;
class rectangle 
{
	float length,width;
	
	void getvalue()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length:");
		length=sc.nextFloat();
		System.out.print("Enter width:");
		width=sc.nextFloat();
	}
	float area()
	{
		return (length*width);
	}
}
class rectangledemo
{
	public static void main(String args[])
	{
		rectangle r1 = new rectangle();
		r1.getvalue();
		
		float ans = r1.area();
		
		System.out.print("Area of rectangle:"+ans);
	}
}