import java.util.*;
public class FibonacciSeriesUptoNthTerm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int term = sc.nextInt();
        sc.close();
        int first = 0,second=1,next,i=0;
        while(i<term){
            next = first + second;
            System.out.print(next+" ");
            first = second;
            second = next;

            i++;
        }
    }
}
