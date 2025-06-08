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

        int a = 2;
        int b = 4;

        // Performing addition of a and b
        int sum = o1.addition(a, b);
        System.out.println("Sum is " + sum);

        // Performing subtraction of b from a
        int sub = o1.subtraction(a, b);
        System.out.println("Subtraction is " + sub);

        // Performing multiplication of a and b
        int mul = o1.multiplication(a, b);
        System.out.println("Multiplication is " + mul);

        // Performing division of a by b
        int div = o1.division(a, b);
        System.out.println("Division is " + div);

        // Performing comparison operations
        System.out.println("Is " + a + " greater than " + b + "? " + o1.isGreater(a, b));
        System.out.println("Is " + a + " less than " + b + "? " + o1.isLess(a, b));
        System.out.println("Is " + a + " equal to " + b + "? " + o1.isEqual(a, b));
        System.out.println("Is " + a + " not equal to " + b + "? " + o1.isNotEqual(a, b));
        System.out.println("Is " + a + " greater than or equal to " + b + "? " + o1.isGreaterOrEqual(a, b));
        System.out.println("Is " + a + " less than or equal to " + b + "? " + o1.isLessOrEqual(a, b));
    }
}
