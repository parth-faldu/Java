class A extends Thread
{
	public void run()
	{
		System.out.print("Hello...");
	}
}
class ThreadDemo
{
	public static void main(String args[])
	{
		A t1 = new A();
		t1.start();
	}
}