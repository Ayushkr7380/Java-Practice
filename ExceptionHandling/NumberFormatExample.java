import java.util.Scanner;

public class NumberFormatExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            int number = Integer.parseInt(input); // May throw NumberFormatException
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } finally {
            System.out.println("Program ended.");
            scanner.close();
        }
    }
}
