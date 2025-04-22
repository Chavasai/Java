import java.util.*;

class  SumofNumbers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n= sc.nextInt();
		int sum=0;
	
		System.out.println("Enter n: ");
			for(int  i=0;i<=n;i++)
			{
				sum=sum+i;
				System.out.println(sum + " ");
			}
	}



}