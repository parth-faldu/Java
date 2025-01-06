class Company 
{
    int ccode;
    String cname;

    public void getCmp(int c, String cn)
	{
		ccode = c;
        cname = cn;
    }
}

class Employee extends Company 
{
    int id;
    String name;
    double basicsalary;
	
	double HRA = 0.1 * basicsalary;
    double MA = 0.05 * basicsalary;
    double EPF = 0.03 * basicsalary;
    double netsalary = basicsalary + HRA + MA - EPF;

    public void getEmp(int i, String n, double b)
	{
        id = i;
        name = n;
        basicsalary = b;
    }

    void show() 
	{
        System.out.println("Company Code: " + ccode);
        System.out.println("Company Name: " + cname);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicsalary);
        System.out.println("HRA: " + HRA);
        System.out.println("MA: " + MA);
        System.out.println("EPF: " + EPF);
        System.out.println("Net Salary: " + netsalary);
    }
}

class comdemo 
{
    public static void main(String[] args) 
	{
        Employee emp1 = new Employee();
        emp1.getCmp(1,"Microsoft");
        emp1.getEmp(101,"John",50000);
        emp1.show();

        Employee emp2 = new Employee();
        emp2.getCmp(2,"Google");
        emp2.getEmp(102,"Jane",60000);
        emp2.show();
    }
}
