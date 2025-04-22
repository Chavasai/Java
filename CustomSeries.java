import java.util.Scanner;

public class CustomSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Printing the series
        System.out.println("Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            int term = (i * i) + 1;
            System.out.print(term + " ");
        }

        scanner.close();
    }
}
