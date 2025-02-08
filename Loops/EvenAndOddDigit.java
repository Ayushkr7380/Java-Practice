import java.util.*;
public class EvenAndOddDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        int EvenCount = 0,OddCount = 0;
        int temp = num;
        while(temp!=0){
            int checkNum = temp % 10;
            if(checkNum % 2 == 0){
                EvenCount++;
            }
            else{
                OddCount++;
            }

            temp /=10;
        }
        System.out.println("Even Count - "+EvenCount); 
        System.out.println("Odd Count - "+OddCount); 
    }
}
