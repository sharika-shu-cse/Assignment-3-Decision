import java.util.Scanner;

public class CompareHalves {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();  // Read the input word

        // Check if the word is not empty
        if (word.length() > 0) {
            // Calculate the middle index
            int length = word.length();
            int mid = length / 2;

            // Handle odd-length words by excluding the middle character
            String firstHalf = word.substring(0, mid);  // First half
            String secondHalf = length % 2 == 0 ? word.substring(mid) : word.substring(mid + 1); // Second half

            // Compare the first and second halves
            if (firstHalf.equals(secondHalf)) {
                System.out.println("First and second half same");
            } else {
                System.out.println("First and second half different");
            }
        } else {
            System.out.println("The word is empty.");
        }

        // Close the scanner
        scanner.close();
    }
}
