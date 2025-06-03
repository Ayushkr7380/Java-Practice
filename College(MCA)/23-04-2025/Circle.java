// Import the Scanner class from the java.util package
import java.util.*;

class Circle {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter radius : ");
        
        // Read the radius as a double value
        double radius = sc.nextDouble();

        // Calculate and display the area of the circle using the formula: Area = π * r * r
        System.out.println("Area of circle is " + (3.14 * radius * radius));
    }
}
