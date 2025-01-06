class base
{
	int a = 10;
}
class derived extends base
{
	int a = 20;
	
	void show()
	{
		System.out.println("derived a="+a);
		System.out.print("base a="+super.a);
	}
}
class supervar
{
	public static void main(String args[])
	{
		derived d1 = new derived();
		d1.show();
	}
}