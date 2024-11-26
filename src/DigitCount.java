import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();  // Read the integer input

        // If the number is negative, multiply it by -1 to make it positive
        if (number < 0) {
            number = -number;
        }

        // Initialize the digit count
        int digitCount = 0;

        // Check how many digits the number has by dividing the number
        // by powers of 10 (10, 100, 1000, etc.)
        if (number >= 1000000000) {
            digitCount = 10;
        } else if (number >= 100000000) {
            digitCount = 9;
        } else if (number >= 10000000) {
            digitCount = 8;
        } else if (number >= 1000000) {
            digitCount = 7;
        } else if (number >= 100000) {
            digitCount = 6;
        } else if (number >= 10000) {
            digitCount = 5;
        } else if (number >= 1000) {
            digitCount = 4;
        } else if (number >= 100) {
            digitCount = 3;
        } else if (number >= 10) {
            digitCount = 2;
        } else {
            digitCount = 1; // Number is a single digit
        }

        // Print the result
        System.out.println("The number has " + digitCount + " digits.");

        // Close the scanner
        scanner.close();
    }
}
