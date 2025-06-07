// Importing classes from the custom package 'ayushpackage'
import ayushpackage.Greet;
import ayushpackage.Operations;

public class Main {
    public static void main(String args[]) {
        // Creating an object of Greet class
        Greet g1 = new Greet();
        // Calling the hello method to print a greeting
        g1.hello();

        // Creating an object of Operations class to perform arithmetic operations
        Operations o1 = new Operations();

        // Performing addition of 2 and 4
        int sum = o1.addition(2, 4);
        System.out.println("Sum is " + sum);

        // Performing subtraction of 4 from 2
        int sub = o1.subtraction(2, 4);
        System.out.println("Subtraction is " + sub);

        // Performing multiplication of 2 and 4
        int mul = o1.multiplication(2, 4);
        System.out.println("Multiplication is " + mul);

        // Performing division of 2 by 4
        int div = o1.division(2, 4);
        System.out.println("Division is " + div);
    }
}
