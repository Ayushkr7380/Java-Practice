import java.util.*;
class Rev{
    int num;
    Rev(int n1){
        num = n1;
    }
    int reverse(){
        int temp=num,rev=0,rem;
        while(temp !=0){
            rem = temp % 10;
            rev = (rev * 10) + rem;
            temp = temp / 10;
        }
        return rev;
    }
}
public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        Rev rev = new Rev(num);

        System.out.println("Reverse of "+num+" is "+rev.reverse());
        //Check for palindrome
        if(rev.reverse() == num){
            System.out.println(num+" is also a palindrome number.");
        }

    }
}
