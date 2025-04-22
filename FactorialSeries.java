import java.util.*;

class FactorialSeries
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of terms: ");
        	int n = sc.nextInt();
		int fact=1;
	
		System.out.println("series :  ");
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
				System.out.print(fact+" ");
			
			}
	
	
	
	
	
	}
}
