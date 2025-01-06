import java.io.*;

class filereader
{
	public static void main(String args[])
	{
		try
		{
			FileReader fr = new FileReader("a1.txt");
	
			int i;
			
			while( (i=fr.read()) != -1 )
			{
				System.out.print( (char)i );
			}
			fr.close();
		}
		catch(IOException e)
		{
			System.out.print("Error.."+e);
		}
	}
}

