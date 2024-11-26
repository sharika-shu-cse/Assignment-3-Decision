import java.util.Scanner;

public class OrderComparison {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Compare the numbers to determine if they are in increasing or decreasing order
        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }

        // Close the scanner
        scanner.close();
    }
}
