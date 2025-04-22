import java.util.Scanner;

public class ArmstrongSimple
{
    	public static void main(String args[]) 
	{
        	Scanner scanner = new Scanner(System.in);

        
        	System.out.print("Enter a number: ");
        	int number = scanner.nextInt();
        	int originalNumber = number;
        	int sum = 0;

               	while (number != 0) 
		{
            		int digit = number % 10; // Get the last digit
            		sum = sum + (digit * digit * digit); // Add cube of the digit
            		number = number / 10; // Remove the last digit
        	}

        		if (sum == originalNumber) 
			{
            			System.out.println(originalNumber + " is an Armstrong number.");
        		} 
				else
 				{
           				System.out.println(originalNumber + " is not an Armstrong number.");
       		 		}

        scanner.close();
    }
}
