import java.io.*;

class copyfile
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fin = new FileInputStream("a2.txt");
			
			FileOutputStream fout = new FileOutputStream("new.txt");
			
			int i;
			
			while( (i=fin.read()) != -1 )
			{
				fout.write(i);
			}
			fin.close();
			fout.close();
			System.out.print("File Copied..");
	
		}
		catch(Exception e)
		{
			System.out.print("Error.."+e);
		}
	}
}