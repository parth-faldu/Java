class argu2
{
	int sum = 0;
	void input(int... n)
	{
		System.out.println("Total arguments:"+n.len);
		
		for(int i=0;i<n.length;i++)
		{
			sum = sum + n[i];
		}
		System.out.print("\nTotal"+sum);
	}
}
class varargu2
{
	public static void main(String args[])
	{
		argu a1 = new argu();
		
		a1.input();
		a1.input(12,34);
		a1.input(12,34,67,89,56);
	}
}