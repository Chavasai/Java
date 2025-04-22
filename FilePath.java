import java.io.*;
class FilePath
{
	public static void main(String args[])
	{
		File obj1 = new File("C:\\Users\\chava sai kiran\\Desktop\\TERM 4\\java\\ArmstrongSimple.java");
		System.out.println(obj1.getName());
		System.out.println(obj1.isFile());
		System.out.println(obj1.isDirectory());
		File dir1=new File("C:\\Users\\chava sai kiran\\Desktop\\TERM 4\\java");
		System.out.println(obj1.isFile());
		System.out.println(obj1.isDirectory());
		
	}
}