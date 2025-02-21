import java.util.*;
public class LargestAndSmallestDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        sc.close();
        int LargestDigit=0,Smallestdigit=9;
        int temp = num;
        while(temp!=0){
            int check = temp % 10;
            if(check > LargestDigit){
                LargestDigit = check;
            }
            if(check < Smallestdigit){
                Smallestdigit = check;
            }
            temp/=10;
        }
        System.out.println("Largest digit is "+LargestDigit);
        System.out.println("Smallest digit is "+Smallestdigit);
    }
}
