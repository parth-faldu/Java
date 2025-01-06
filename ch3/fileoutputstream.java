import java.io.*;

class fileoutputstream
{
	public static void main(String args[])
	{
		try 
		{
			FileOutputStream fout = new FileOutputStream("a1.txt");
			
			String s = "Be honest";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.print("Data Write Successfully...");
		}
		catch(IOException e)
		{
			System.out.print("Error.."+e);
		}
	}
}