import java.util.*;
public class GreatestCommonDivisor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1,num2,gcd;
        System.out.print("Enter 1st number : ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        num2 = sc.nextInt();

        //Make sure num1 is greater than num2
        if(num1<num2){
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
        }

        //Find GCD
        while(num2!=0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        gcd = num1;
        System.out.println("Greatest common divisior is "+gcd);
    }
}
