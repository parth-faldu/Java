//1.input 1 number as command line argument and check whether its odd or even 

class cla_odd_even
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		
		if(a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}