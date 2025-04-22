import java.io.*;
class Student implements Serializable
{
	int roll;
	String name;
	public Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
}
public class StudentSerializableTest1
{
	public static void main(String[] args)throws IOException,ClassNotFoundException
	{
		Student stu1=new Student(101,"Mr.x");
		FileOutputStream  fos=new FileOutputStream("Data.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(stu1);
		oos.close();
		fos.close();	
	}	
}