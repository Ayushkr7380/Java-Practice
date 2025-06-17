import java.util.*;

public class CountCurrency {
    public static void main(String args[]) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the amount
        System.out.print("Enter the amount : ");
        int money = sc.nextInt(); // Read the amount from user input

        sc.close(); // Close the Scanner as it is no longer needed

        // Array of currency denominations in descending order
        int denominations[] = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        // Array to store count of notes for each denomination
        int count[] = new int[denominations.length];

        // Loop through each denomination
        for (int i = 0; i < denominations.length; i++) {
            // Calculate how many notes of the current denomination are needed
            count[i] = money / denominations[i];

            // Update the remaining amount after using the current denomination
            money = money % denominations[i];
        }

        // Display the number of notes for each denomination used
        for (int i = 0; i < denominations.length; i++) {
            if (count[i] > 0) {
                System.out.println(denominations[i] + " : " + count[i]);
            }
        }
    }
}
