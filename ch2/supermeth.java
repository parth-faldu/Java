class base
{
	void show()
	{
		System.out.println("from base class");
	}
}
class derived extends base
{
	void show()
	{
		super.show();
		System.out.print("from derived class");
	}
}
class supermeth
{
	public static void main(String args[])
	{
		derived d1 = new derived();
		d1.show();
	}
}