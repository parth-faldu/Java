import java.util.*;
class BankDetails
{
	int accno;
	String name;
	String acc_type;
	float balance;
	float deposit=0,withdrawal=0;
	
	Scanner sc = new Scanner(System.in);
	
	void openAccount()
	{
		System.out.println("\n\t---Enter Details---");
		System.out.print("\nAccount Number:");
		accno = sc.nextInt();
		sc.nextLine();
		System.out.print("Account Holder Name:");
		name = sc.nextLine();
		System.out.print("Account Type:");
		acc_type = sc.nextLine();
		System.out.print("Account Balance:");
		balance = sc.nextFloat();
		while(balance<1000)
		{
			System.out.println("\nMinimum Amount Is 1000..!!");
			System.out.print("\nAccount Balance:");
			balance = sc.nextFloat();	
		}
	}
	void showAccount()
	{
		System.out.println("\n\t---Bank Account Details---");
		System.out.println("\nAccount Number:"+accno);
		System.out.println("Account Holder Name:"+name);
		System.out.println("Account Type:"+acc_type);
		System.out.println("Account Balance:"+balance);
	}
	void deposit()
	{
		System.out.print("\nEnter Amount For Deposit:");
		deposit = sc.nextFloat();
		balance += deposit;
	}
	void withdrawal()
	{
		if (balance!=0)
		{
			System.out.print("Enter Ammount For Withdraw:");
			withdrawal = sc.nextFloat();
			balance -= withdrawal;
		}
		else
		{
			System.out.print("Balance Insufficient...!!!");
		}
	}
}
class BankDemo
{
	public static void main(String args[])
	{
		BankDetails  b = new BankDetails();
		
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		while(true)
		{
		
			System.out.println("\n(1)Open Account");
			System.out.println("(2)Show Account");
			System.out.println("(3)Deposit");
			System.out.println("(4)Withdrawal");
			System.out.println("(5)Exit");
			System.out.print("\nEnter Your Choice:");
			ch = sc.nextInt();
		
			switch(ch)
			{
					case 1:
						b.openAccount();
						break;
					
					case 2:
						b.showAccount();
						break;
						
					case 3:
						b.deposit();
						break;
						
					case 4:
						b.withdrawal();
						break;
						
					case 5:
						System.exit(0);
						
					default:
						System.out.print("Inavlid Choice..!!");
			}
		}
	}
}