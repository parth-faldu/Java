/*
1) Write application that declares a class named Employee. It should have instance 
variables age, name & salary. These should be of type int, String, float respectively. 
Create the object of Employee class and set and display its instance variable.
*/
class employee
{
	int age;
	String name;
	float salary;
	
	void getdata(int a,String n,float s)
	{
		age = a;
		name = n;
		salary = s;
	}
	void putdata()
	{
		System.out.println("Age:"+age);
		System.out.println("Name:"+name);
		System.out.print("Salary:"+salary);
	}
}
class empdemo
{
	public static void main(String args[])
	{
		employee e1 = new employee();
		
		e1.getdata(35,"john",30000);
		e1.putdata();
	}
}