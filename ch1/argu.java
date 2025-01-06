/*variable lenght arguments*/
class argu
{
	void input(int... n)
	{
		System.out.println("Total arguments:"+n.length);
	}
}
class varargu
{
	public static void main(String args[])
	{
		argu a1 = new argu();
		
		a1.input();
		a1.input(12,34);
		a1.input(12,34,67,89,56);
	}
}