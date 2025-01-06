import java.io.*;

class filewriter
{
	public static void main(String args[])
	{
		try
		{
			FileWriter fw = new FileWriter("a2.txt");
			fw.write("Hello World");
			fw.close();
			System.out.print("Data Write Successfully");
		}
		catch(IOException e)
		{
			System.out.print("Error.."+e);
		}
	}
}