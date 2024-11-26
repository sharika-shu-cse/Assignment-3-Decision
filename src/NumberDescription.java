import java.util.Scanner;

public class NumberDescription {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a floating-point number
        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();  // Read the floating-point input

        // Check if the number is zero
        if (number == 0) {
            System.out.println("zero");
        } else {
            // Check if the number is positive or negative
            if (number > 0) {
                System.out.print("positive");
            } else {
                System.out.print("negative");
            }

            // Check if the absolute value of the number is small or large
            if (Math.abs(number) < 1) {
                System.out.println(" small");
            } else if (Math.abs(number) > 1000000) {
                System.out.println(" large");
            } else {
                System.out.println();
            }
        }

        // Close the scanner
        scanner.close();
    }
}
