/*custom Exception or user defined exception
define a class LessAmoutnException to handle exception 
if withdrawal amount is less than or equal to zero */

import java.util.*;

class LessAmountException extends Exception
{
	LessAmountException(String msg)
	{
		super(msg);
	}
}
class CustomExp
{
	public static void main(String args[])
	{
		float amount;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Withdrawal amount:");
		amount = sc.nextFloat();
		
		try
		{
			if(amount<=0)
			{
				throw new LessAmountException("withdrawal unavailable");
			}
			else
			{
				System.out.println("withdrawal avaliable ");
			}
		}
		catch(LessAmountException e)
		{
			System.out.println("Amount is less than or equal to 0");
		}
	}
}