import java.util.Scanner;

public class OrderComparisonWithMode {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the mode (strict or lenient)
        System.out.print("Enter the mode (strict/lenient): ");
        String mode = scanner.nextLine().toLowerCase();  // Read and convert to lowercase

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Mode-based logic for comparison
        if (mode.equals("strict")) {
            // Strict mode: strictly increasing or decreasing
            if (num1 < num2 && num2 < num3) {
                System.out.println("Increasing");
            } else if (num1 > num2 && num2 > num3) {
                System.out.println("Decreasing");
            } else {
                System.out.println("Neither");
            }
        } else if (mode.equals("lenient")) {
            // Lenient mode: numbers can be equal to the previous number
            if (num1 <= num2 && num2 <= num3) {
                System.out.println("Increasing");
            } else if (num1 >= num2 && num2 >= num3) {
                System.out.println("Decreasing");
            } else {
                System.out.println("Neither");
            }
        } else {
            System.out.println("Invalid mode. Please enter 'strict' or 'lenient'.");
        }

        // Close the scanner
        scanner.close();
    }
}
