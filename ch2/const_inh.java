class company
{
	int code;
	String cname;
	
	company(int c,String cnm)
	{
		code = c;
		cname = cnm;
	}
}
class department extends company 
{
	int deptno;
	String deptname;
	
	department(int dno,String dnm)
	{
		super(111,"TCS");
		deptno = dno;
		deptname = dnm;
	}
	void show()
	{
		System.out.println("company code="+code);
		System.out.println("company name="+cname);
		System.out.println("Department no="+deptno);
		System.out.println("Department name="+deptname);
	}
}
class const_inh
{
	public static void main(String args[])
	{
		department d1 = new department(10,"production");
		d1.show();
	}
}