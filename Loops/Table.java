import java.util.*;
class Table1{
    int num;
    Table1(int n){
        num = n;
    }
    void table(){
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+(num*i));
        }
    }
}
public class Table{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num = sc.nextInt();
        sc.close();
        Table1 t1 = new Table1(num);
        t1.table();
    }
}