import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        sc.close();
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("Factorail of "+num+" is "+fact);
    }
}
