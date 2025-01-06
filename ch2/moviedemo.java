class movie
{
	String name;
	String showtime;
	float ticketrate;
	
	movie(String n,String s,float t)
	{
		name = n;
		showtime = s;
		ticketrate = t;
	}
	void display()
	{
		System.out.println("\n\nName:"+name);
		System.out.println("Showtime:"+showtime);
		System.out.println("ticketrate:"+ticketrate);
	}
}
class moviedemo
{
	public static void main(String args[])
	{
		movie m1 = new movie("kgf1","10:00 pm",250);
		movie m2 = new movie("leo","2:00 pm",500);
		
		m1.display();
		m2.display();
	}
}