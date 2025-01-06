/*define a class product having variable pid,pname,pprice,tot_quantity.
define getProduct() method to initialize value.
define putproduct() method to display all value with total amount.
create two object and call methods.*/
import java.util.*;
class product
{
	int pid;
	String pname;
	int pprice;
	int tot_quantity;
	
	void getproduct()
	{
			Scanner sc=new Scanner(System.in);
			
			System.out.print("\nEnter product id:");
			pid=sc.nextInt();
			sc.nextLine();
			System.out.print("Enter product name:");
			pname=sc.nextLine();
			System.out.print("Enter product price:");
			pprice=sc.nextInt();
			System.out.print("Enter product quantity:");
			tot_quantity=sc.nextInt();
	}
	void putproduct()
	{
		System.out.println("\nproduct id:"+pid);
		System.out.println("product name:"+pname);
		System.out.println("product price:"+pprice);
		System.out.println("product quantity:"+tot_quantity);
	}
}
class productdemo
{
	public static void main(String args[])
	{
		product p1 = new product();
		product p2 = new product();
		
		p1.getproduct();
		p2.getproduct();
		
		p1.putproduct();
		p2.putproduct();
	}
}