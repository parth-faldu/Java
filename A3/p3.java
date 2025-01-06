class AddSub
{
	int num1=10,num2=20;
	
	void calAdd()
	{
		System.out.println("Addition:"+(num1+num2));
	}
	void calSub()
	{
		System.out.println("Subtraction:"+(num1-num2));
	}
}
class MulDiv extends AddSub
{
	void calMul()
	{
		System.out.println("Multiplication:"+(num1*num2));
	}
	void calDiv()
	{
		System.out.println("Divison:"+(num1/num2));
	}
}
class p3
{
	public static void main(String args[])
	{
		MulDiv m1 = new MulDiv();
		
		m1.calAdd();
		m1.calSub();
		m1.calMul();
		m1.calDiv();
		
	}
}