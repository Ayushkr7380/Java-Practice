import java.util.*;
public class CountNumberOfDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;
        while(temp!=0){
            temp = temp / 10; 
            count = count + 1;
        }
        System.out.println(num+" - "+ count+" digits");
    }
}
