import java.util.Scanner;

class arithmetic
{
	public static void main(String args[])
	{
		double x,y;
		char z;
		
		double sum,sub,m,d;
		
		System.out.print("Enter Number 1:");
		Scanner a=new Scanner(System.in);
		
		System.out.print("Enter Number 2:");
		Scanner b=new Scanner(System.in);
	
		System.out.print("Enter your choice:");
		Scanner c=new Scanner(System.in);
		
		z=c.nextChar();
		
		x=a.nextDouble();
		y=b.nextDouble();
		
		switch(z)
		{

			case '+':
				sum=x+y;
				System.out.print("Addition:"+sum);
				
			case '-':
				sub=x-y;
				System.out.print("Subtraction:"+sub);
				
			case '*':
				sum=x*y;
				System.out.print("Multiplication:"+m);

			case '/':
				sum=x/y;
				System.out.print("Division:"+d);
		}
	}
}