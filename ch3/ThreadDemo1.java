class MyThread implements Runnable
{
	public void run()
	{
		System.out.print("Hello...");
	}
}
class ThreadDemo1
{
	public static void main(String args[])
	{
		MyThread t1 = new MyThread();
		Thread obj = new Thread(t1);
		obj.start();
	}
}