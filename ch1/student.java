/*define a class student having variable exam no.,name,div,sem and sub1,sub2,sub3
define input method to initialize value also define reserved method to calculate total,percentage and grade 
also define display method to display all information.
create two object and demonstrate 
*/
import java.util.*;
class student
{
	int exam_no;
	String name;
	String div;
	int sem;
	int sub1,sub2,sub3;
	
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter Exam Number:");
		exam_no = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name:");
		name = sc.nextLine();
		System.out.print("Enter Division:");
		div = sc.nextLine();
		System.out.print("Enter Sem:");
		sem = sc.nextInt();
		System.out.print("Enter Marks of Subject 1:");
		sub1 = sc.nextInt();
		System.out.print("Enter Marks of Subject 2:");
		sub2 = sc.nextInt();
		System.out.print("Enter Marks of Subject 3:");
		sub3 = sc.nextInt();
	}
	void putdata()
	{
		
		float total,p;
		total=(sub1+sub2+sub3);
		p=(sub1+sub2+sub3)/3;
		System.out.println("\nTotal Marks:"+total);
		System.out.println("percentage:"+p);
		System.out.print("Grade:");
		
		if(p>=70){
			System.out.println("Distinction");
		}
		else if(p<70 && p>=60){
			System.out.println("First class");
		}
		else if(p<60 && p>=50){
			System.out.println("Second class");
		}
		else if(p<50 && p>=40){
			System.out.println("Pass class");
		}
		else{
			System.out.println("Fail");
		}
	}
}
class studdemo
{
	public static void main(String args[])
	{
		student s1 = new student();
		student s2 = new student();
		
		s1.getdata();
		s2.getdata();
		
		s1.putdata();
		s2.putdata();
	}
}
