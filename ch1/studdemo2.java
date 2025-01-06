import java.util.*;
class student
{
	int enrno;
	String name;
	String stream;
	float per;
	
	Scanner sc = new Scanner(System.in);
	
	void getstud()
	{
			System.out.print("Enrollment no:");
			enrno = sc.nextInt();
			sc.nextLine();
			System.out.print("Name:");
			name = sc.nextLine();
			System.out.print("Stream:");
			stream = sc.nextLine();
			System.out.print("Percentage:");
			per = sc.nextFloat();
	}
}
class cia_1 extends student
{
	float java,php,ds,eng;
	
	void getmarks()
	{
		System.out.print("java:");
		java = sc.nextFloat();
		System.out.print("php:");
		php = sc.nextFloat();
		System.out.print("ds:");
		ds = sc.nextFloat();
		System.out.print("english:");
		eng = sc.nextFloat();
	}
	void display()
	{
		System.out.println("\n\nEnrollment no:"+enrno);
		System.out.println("Name:"+name );
		System.out.println("Stream:"+stream );
		System.out.println("Percentage:"+per);
		
		System.out.println("java:"+java);
		System.out.println("php:"+php );
		System.out.println("ds:"+ds);
		System.out.println("english:"+eng);
	}
}
class studdemo2
{
	public static void main(String args[])
	{
		cia_1 c1 = new cia_1();
		
		c1.getstud();
		c1.getmarks();
		
		c1.display();
	}
}
