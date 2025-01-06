class jogged_array
{
	public static void main(String args[])
	{
		int n[][]=new int [4][4];
		
		int k=1;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				n[i][j] = k++;
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}
}