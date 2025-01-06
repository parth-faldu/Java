/*input lenght and width for rectangle calculate area and display answer*/

import java.util.*;
class _2
{
	public static void main(String args[])
	{
		float l,w;
		
		Scanner x=new Scanner(System.in);
		
		System.out.print("\nEnter Length:");
		l=x.nextFloat();
		System.out.print("Enter Width:");
		w=x.nextFloat();
		
		System.out.println("\nArea of Rectangle:"+(l*w));
	}
}
