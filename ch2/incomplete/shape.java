interface area
{
	
}
interface volume
{
	
}


class shape
{
	String name;
	
	shape()
	{
		
	}
	public getName()
	{
		
	}
}
class circle extends shape implements area
{
	double radius;
	
	circle(double r,String n)
	{
		
	}
}
class square extends shape implements area
{
	double side;
	
	square(double s,String n)
	{
		
	}
}
class cylinder extends circle implements volume
{
	double height;
	
	cylinder(double h,double r, String n)
	{
		
	}
}
class sphere extends circle implements volume
{
	sphere(double r,String n)
	{
		
	}
}
class cube
{
	cube(double s,String n) extends square implements volume
	{
		
	}
}
class glome extends sphere implements volume
{
	glome(double r,String n)
	{
		
	}
}