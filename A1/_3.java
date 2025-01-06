/*3) Input three numbers and find minimum among them.*/
import java.util.*;
class _3
{
	public static void main(String args[])
	{
		int x,y,z;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Value 1:");
		x=sc.nextInt();
		
		System.out.print("Enter Value 2:");
		y=sc.nextInt();
		
		System.out.print("Enter Value 3:");
		z=sc.nextInt();
		
		if(x>y)
		{
			if(y>z)
			{
				System.out.print(z+" is minimum");
			}
			else
			{
				System.out.print(y+" is minimum");
			}
		}
		else
		{
			if(x>z)
			{
				System.out.print(z+" is minimum");
			}
			else
			{
				System.out.print(x+" is minimum");
			}
		}
	}
}