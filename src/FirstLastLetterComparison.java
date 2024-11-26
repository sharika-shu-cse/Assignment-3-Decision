import java.util.Scanner;

public class FirstLastLetterComparison {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  // Read the input string

        // Check if the string is not empty
        if (input.length() > 0) {
            // Compare the first and last letter of the string
            char firstLetter = input.charAt(0);  // Get the first letter
            char lastLetter = input.charAt(input.length() - 1);  // Get the last letter

            // Compare the first and last letter
            if (firstLetter == lastLetter) {
                System.out.println("First and last letter same");
            } else {
                System.out.println("First and last letter different");
            }
        } else {
            System.out.println("The string is empty.");
        }

        // Close the scanner
        scanner.close();
    }
}
