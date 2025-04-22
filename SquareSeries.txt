import java.util.Scanner;

class SquareSeries 
{
    	public static void main(String[] args)
	 {
        	Scanner sc = new Scanner(System.in);

        	// Input: Number of terms
       		 System.out.print("Enter the number of terms: ");
        	int n = sc.nextInt();

        	// Print the series
        	System.out.print("Series: ");
        	for (int i = 1; i <= n; i++) 
		{
            		System.out.print((i * i) + " ");
        	}

        sc.close();
    }
}
