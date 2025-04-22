import java.io.*;
class CopyFile
{
	public static void main(String args[])throws FileNotFoundException,IOException
	{
		FileInputStream fis = new FileInputStream("File1.txt");
		FileOutputStream fos=new FileOutputStream("File2.txt");
		int i;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		fis.close();
		fos.close();
	}
	
	
}