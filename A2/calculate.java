class calculate
{
	int add(int a,int b)
	{
		return (a+b);
	}
	float add(float a,float b)
	{
		return (a+b);
	}
	String add(String s1,String s2)
	{
		return (s1+s2);
	}
}
class calculatedemo
{
	public static void main(String args[])
	{
		calculate c1 = new calculate();
		
		System.out.println("Sum Of Two Integer Number:"+c1.add(1,1));
		System.out.println("Sum Of Two Float Number:"+c1.add(1.5f,1.5f));
		System.out.print("Concatination Of Two Strings:"+c1.add("hi...","im parth"));
	}
}