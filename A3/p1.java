import java.util.*;
class university
{
	String uname;
	String ucity;
	int tot_stud;
	
	Scanner sc = new Scanner(System.in);

	void getUni()
	{
		System.out.print("Enter University Name:");
		uname = sc .nextLine();
		System.out.print("Enter University City:");
		ucity = sc.nextLine();
		System.out.print("Enter University Total Student:");
		tot_stud = sc.nextInt();
	}
}
class department extends university
{
	int deptno;
	String deptname;
	
	void getDept()
	{
		System.out.print("Enter Department number:");
		deptno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Department Name:");
		deptname = sc.nextLine();
	}
	void display()
	{
		System.out.println("\nUniversity Name:"+uname);
		System.out.println("University City:"+ucity);
		System.out.println("University Total Student:"+tot_stud);
		System.out.println("Department Number:"+deptno);
		System.out.println("Department Name:"+deptname);
	}
}
class p1
{
	public static void main(String args[])
	{
		department d1 = new department();
		
		d1.getUni();
		d1.getDept();
		
		d1.display();
	}
}