class p8
{
	public static void main(String args[])
	{
		String s1 = "Atmiya University";
		char c;
		c = s1.charAt(2);
		System.out.println("3rd character of the string:"+c);
		
		String s2="Java Programming";
		int i;
		i = s2.indexOf("o");
		System.out.println("index of o:"+i);
		
		String s3 = "Enjoy Holiday";
		System.out.println("UpperCase:"+s3.toUpperCase());
		
		String s4 = "Hello... Hi..";
        String r = s4.replace('H', 'n');
        System.out.println("replacing character: " + r);
	}
}