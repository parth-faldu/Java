class str
{
	public static void main(String args[])
	{
		String s = "Java is simple language";
		System.out.println(s);
		System.out.println("Length:"+s.length());
		System.out.println("uppercase:"+s.toUpperCase());
		System.out.println("lowercase:"+s.toLowerCase());
		System.out.println("index of s:"+s.indexOf('s'));
		System.out.println("replace a wiht b :"+s.replace('a','b'));
		System.out.println("replace is wiht was :"+s.replace("is","was"));
		System.out.println("substring from index no 15:"+s.substring(15,23));
		System.out.println("substring from index no 15 to 18:"+s.substring(15,18));
		System.out.println("starts with J :"+s.startsWith("J"));
		System.out.println("ends with j :"+s.endsWith("j"));
	}
}