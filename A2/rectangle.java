class rectangle
{
	double length,width;
	
	void setValue(double l,double w)
	{
		length=l;
		width=w;
	}
	void area()
	{
		System.out.print("Area Of Rectangle:"(+length*width));
	}
}
class rectangledemo
{
	public static void main(String args[])
	{
		rectangle r1 = new rectangle();
		
		r1.setValue(2,3);
		r1.show();
	}
}