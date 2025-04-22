import java.util.Scanner;

class OddSeries
{
   	 public static void main(String[] args)
	 {
       		 Scanner sc = new Scanner(System.in);

        	// Input: Number of terms
        	System.out.print("Enter the number of terms: ");
        	int n = sc.nextInt();

        	// Print the series
        	System.out.print("Series: ");
        	for (int i = 0; i < n; i++) 
		{
            		System.out.print((2 * i + 1) + " ");
        	}

        sc.close();
    }
}
