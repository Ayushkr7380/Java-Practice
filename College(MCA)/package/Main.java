import ayushpackage.Greet;
import ayushpackage.Operations;
public class Main {
    public static void main(String args[]){
        Greet g1 = new Greet();
        g1.hello();

        Operations o1 = new Operations();
        int sum = o1.addition(2,4);
        System.out.println("Sum is "+sum);

        int mul = o1.multiplication(2,4);
        System.out.println("Multiplication is "+mul);
    }
}
