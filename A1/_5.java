/*input one number and print it's multiplication table*/
import java.util.*;
class _5
{
	public static void main(String args[])
	{
		int a;
		
		a=Integer.parseInt(args[0]);
		
		for(int x=1;x<=10;x++){
			System.out.println(a+"*"+x+"="+(a*x));
		}
	}
}