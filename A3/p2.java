import java.util.*;
class university
{
	String uname;
	String ucity;
	int tot_stud;
	
	Scanner sc = new Scanner(System.in);

	university(String unm,String uc,int t)
	{
		uname = unm;
		ucity = uc;
		tot_stud = t;
	}
}
class department extends university
{
	int deptno;
	String deptname;
	
	department(int dno,String dnm)
	{
		super("Atmiya","rajkot",1000);
		deptno = dno;
		deptname = dnm;
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
class p2
{
	public static void main(String args[])
	{
		department d1 = new department(10,"c.s. & i.t.");
		d1.display();
	}
}