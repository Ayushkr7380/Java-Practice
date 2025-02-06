import java.util.*;
class RecursiveFact{

    int recursive(int num){
        if (num == 0 || num == 1) return 1;

        return num * recursive(num - 1);
    }
}
public class RecursionFactorial {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        RecursiveFact f1 = new RecursiveFact();

        System.out.println("Factorial of "+num+" is "+f1.recursive(num));
    }
}
