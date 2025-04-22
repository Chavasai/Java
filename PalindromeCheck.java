import java.util.Scanner;

public class PalindromeCheck 
{
    	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a number: ");
        	int number = scanner.nextInt();
        	int originalNumber = number;
        	int reverse = 0;

                while (number != 0) 
		{
            		int digit = number % 10; // Get the last digit
            		reverse = reverse * 10 + digit; // Build the reversed number
            		number = number / 10; // Remove the last digit
        	}
       	        		if (originalNumber == reverse)
			 {
            			System.out.println(originalNumber + " is a palindrome.");
        		} 
				else 
				{
            				System.out.println(originalNumber + " is not a palindrome.");
        			}

        scanner.close();
    }
}
