/*input rollno and marks of 5 subjects calculate total marks, percentage, find grade 

per >=70 Distinction
per < 70 && per >=60 first class
per < 60 && per >=50 sc
per <50 && per >=40 pass class
per < 40 fail

*/
import java.util.*;
class _4
{
	public static void main(String args[])
	{
		int r,m1,m2,m3,m4,m5,t;
		float p;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nEnter Mark Of Subject 1:");
		m1=sc.nextInt();
		System.out.print("Enter Mark Of Subject 2:");
		m2=sc.nextInt();
		System.out.print("Enter Mark Of Subject 3:");
		m3=sc.nextInt();
		System.out.print("Enter Mark Of Subject 4:");
		m4=sc.nextInt();
		System.out.print("Enter Mark Of Subject 5:");
		m5=sc.nextInt();

		
		p=(m1+m2+m3+m4+m5)/3;
		System.out.println("\n\nTotal Marks:"+(m1+m2+m3+m4+m5));
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