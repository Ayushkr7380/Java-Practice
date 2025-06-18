import java.util.Scanner;

// Custom exception class for temperature-related messages
class CustomTempException extends Exception {

    // Constructor that takes a message and passes it to the superclass (Exception)
    public CustomTempException(String message) {
        super(message);
    }
}

public class CheckTemp {
    public static void main(String args[]) throws CustomTempException {
        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter the temperature
        System.out.print("Enter Temperature : ");
        int temp = sc.nextInt();  // Reading the temperature as an integer

        // Checking temperature range and throwing custom exceptions accordingly
        if (temp < 15) {
            // Temperature is below normal range
            throw new CustomTempException("Temperature Below Normal.");
        } else if (temp >= 15 && temp <= 42) {
            // Temperature is within the normal range
            throw new CustomTempException("Temperature Normal.");
        } else if (temp > 42) {
            // Temperature is above normal range
            throw new CustomTempException("Temperature is High.");
        }

        // Closing the sca
