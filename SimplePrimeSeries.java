import java.util.Scanner;

public class SimplePrimeSeries
{
    	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the limit: ");
        	int limit = scanner.nextInt();

        	System.out.println("Prime numbers up to " + limit + " are:");

        // Loop to check prime numbers
        	for (int num = 2; num <= limit; num++) 
		{
            		int count = 0;
            		for (int i = 1; i <= num; i++) 
			{
                		if (num % i == 0) 
			{
                    	count++; // Count the number of divisors
                }
            }
            if (count == 2) { // If divisible by only 1 and itself
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
