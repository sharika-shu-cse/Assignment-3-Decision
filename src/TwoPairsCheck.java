import java.util.Scanner;
import java.util.HashMap;

public class TwoPairsCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input four integers
        System.out.print("Enter four integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // Use a HashMap to count occurrences of each number
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(a, countMap.getOrDefault(a, 0) + 1);
        countMap.put(b, countMap.getOrDefault(b, 0) + 1);
        countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        countMap.put(d, countMap.getOrDefault(d, 0) + 1);

        // Check if the numbers form two pairs
        if (countMap.size() == 2 && countMap.containsValue(2)) {
            System.out.println("two pairs");
        } else {
            System.out.println("not two pairs");
        }

        scanner.close();
    }
}
