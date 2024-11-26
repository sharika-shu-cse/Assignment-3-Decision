import java.util.Scanner;

public class OrderCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three integers
        System.out.print("Enter three integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Check if they are in ascending or descending order
        if ((a <= b && b <= c) || (a >= b && b >= c)) {
            System.out.println("in order");
        } else {
            System.out.println("not in order");
        }

        scanner.close();
    }
}
