import java.util.*;
class _1
{
		public static void main(String args[])
		{
			int no;	
			String name;
			int pmr,cmr;
			String eb;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("\nEnter Consumer Number:");
			no=sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Enter Name:");
			name=sc.nextLine();
			
			System.out.print("Enter Previous Month Reading:");
			pmr=sc.nextInt();
			
			System.out.print("Enter Current Month Reading:");
			cmr=sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Type of EB connection(domestic or commercial):");
			eb=sc.nextLine();
			
			double units = cmr - pmr;
			double billamount=0;
		
			if(eb.equalsIgnoreCase("domestic"))
			{
				if(units<=100)
				{
					billamount = units * 1;
				}
				else if(units<=200)
				{
					billamount = 100 * 1 + (units-100) * 2.50;
				}
				else if(units<=500)
				{
					billamount = 100 * 1 + 100 * 2.50 + (units-200) * 4;
				}
				else
				{
					billamount = 100 * 1 + 100 * 2.50 + 300 * 4 + (units-500) * 6;
				}
			}
			if(eb.equalsIgnoreCase("commercial"))
			{
				if(units<=100)
				{
					billamount= units * 2;
				}
				else if(units<=200)
				{
					billamount= 100 * 2 + (units-100) * 4.50;
				}
				else if(units<=500)
				{
					billamount = 100 * 2 + 100 * 4.50 + (units-200) * 6;
				}
				else
				{
					billamount = 100 * 2 + 100 * 4.50 + 300 * 6 + (units-500) * 7;
				}
			}
			
			System.out.println("\nBill Amount:"+billamount);
	}
}