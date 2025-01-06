import java.util.*;
class _6
{
	public static void main(String args[])
	{
		char c;
		String s;
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("\na.Fatctorial");
		System.out.println("b.Number is odd or even");
		System.out.println("c.exit");
			
		System.out.print("\nEnter Your Choice:");
		s=sc.next();
		c=s.charAt(0);
			
		switch(c)
		{
			case 'a':
				int num1,f=1;
					
				System.out.print("\nEnter Number:");
				num1=sc.nextInt();
					
				for(int i=1;i<=num1;i++)
				{
					f*=i;
				}	
				System.out.println("\n\nFactorial:"+f);
					
				break;
					
			case 'b':
				int num2;
					
				System.out.print("\nEnter Number:");
				num2=sc.nextInt();
					
				if(num2%2==0)
				{
					System.out.println("\nnumber is even");
				}
				else
				{
					System.out.println("\nnumber is odd");
				}
				
				break;
					
			case 'c':
				System.exit(0);
					
			default:
				System.out.print("Invalid Choice..!!");
		}
	}
}