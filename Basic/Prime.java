import java.util.*;
class P{
    int num;
    P(int n){
        num = n;
    }
    int prime(){
        int i;
        for(i=2;i<=num/2;i++){
            if(num % i == 0){
                return 1;
            }
        }
        return 0;
    }
}
public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        P prime = new P(num);
        if(prime.prime() == 0){
            System.out.println(num+" is a prime number.");
        }
        else{
            System.out.println(num+" is not a prime number.");
        }
    }    
}
