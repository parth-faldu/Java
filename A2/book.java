import java.util.*;
class book
{
	String title;
	float price;
	int no_of_page;
		
	Scanner sc = new Scanner(System.in);
	
	book()
	{
		System.out.print("Book Title:");
		title=sc.nextLine();
		System.out.print("Book Price:");
		price=sc.nextInt();
		System.out.print("Book Number Of Page:");
		no_of_page=sc.nextInt();
	}
	book(String t,float p,int n)
	{
		title=t;
		price=p;
		no_of_page=n;
	}
	void show()
	{
		System.out.println("\nBook Title:"+title);
		System.out.println("Book Price:"+price);
		System.out.println("Book Number Of Page:"+no_of_page);
	}
}
class bookdemo
{
	public static void main(String args[])
	{
		book b1 = new book();
		book b2 = new book("Do Epic Shit Done",499f,280);
		
		b1.show();
		b2.show();
	}
}