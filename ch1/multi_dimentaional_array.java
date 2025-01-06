class multi_dimentaional_array
{
	public static void main(String args[])
	{
		int n[][]={{5,4,2},{8,6,7},{9,1,3}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}
}