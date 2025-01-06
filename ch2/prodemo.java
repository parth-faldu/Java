import java.util.*;
class product
{
	int pid;
	String name;
	float pprice;
	
	Scanner sc = new Scanner(System.in);
	
	product()
	{
		System.out.print("id:");
		pid = sc.nextInt();
		sc.nextLine();
		System.out.print("name:");
		name = sc.nextLine();
		System.out.print("price:");
		pprice = sc.nextFloat();
	}
	
	product(int p,String n,float pp)
	{
		pid = p;
		name = n;
		pprice = pp;
	}
	void display()
	{
		System.out.println("\n\nid:"+pid);
		System.out.println("name:"+name);
		System.out.println("price:"+pprice);
	}
}
class prodemo
{
	public static void main(String args[])
	{
		product p1 = new product();
		product p2 = new product(12,"fan",1000);
		
		p1.display();
		p2.display();
	}
}