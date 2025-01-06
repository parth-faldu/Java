/*8) Input five numbers as command line arguments and store those numbers into an array
and print all elements as output.*/
class _8
{
	public static void main(String args[])
	{
		int n[] = new int [args.length];
		
		for(int i=0;i<args.length;i++)
		{
			n[i] = Integer.parseInt(args[i]);
		}
		
		for(int i :n)
		{
			System.out.println(i);
		}
	}
}