import java.util.*;
class SumTable{
    void sumTable(int num){
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+(i*num));
            sum += (i*num);
        }
        System.out.println("Sum of result of table is "+sum);
    }
}
public class SumOFTableResult {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        SumTable st = new SumTable();
        st.sumTable(num);
    }
}
