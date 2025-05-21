import java.util.Scanner;

public class DivisionException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking input
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            // Always runs
            System.out.println("Execution complete.");
            scanner.close();
        }
    }
}
