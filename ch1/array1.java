class array1
{
	public static void main(String args[])
	{
		int a[]={5,3,5,4,6,3,5,9,2},c,min=a[0],max=a[0],s=0;
		
		for(int i=0;i<a.length;i++)
		{
			c=0;
			s+=a[i];
			
			for(int j=0;j<a.length;j++)
			{
				if(min>a[j])
				{
					min=a[j];
				}
				if(max<a[j])
				{
					max=a[j];
				}
				if(a[i]==a[j])
				{
					c++;
				}
			}
			System.out.println(a[i]+"="+c);
		}
		System.out.print("\nmin="+min);
		System.out.print("\nmax="+max);
		System.out.print("\nSum="+s);
	}
}