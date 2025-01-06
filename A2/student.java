import java.util.*;
class student
{
	String name;
	int age;
	String gender;

	Scanner sc = new Scanner(System.in);
	
	student()
	{
		System.out.print("Enter Name:");
		name=sc.nextLine();
		System.out.print("Enter Age:");
		age=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Gender(m/f):");
		gender=sc.nextLine();
	}
	student(String n,int a,String g)
	{
		name=n;
		age=a;
		gender=g;
	}
	void show()
	{
		System.out.println("\nEnter Name:"+name);
		System.out.println("Enter Age:"+age);
		System.out.println("Enter Gender(m/f):"+gender);
	}
}
class studentdemo
{
	public static void main(String args[])
	{
		student s1 = new student();
		student s2 = new student("john",20,"male");
		
		s1.show();
		s2.show();
	}
}