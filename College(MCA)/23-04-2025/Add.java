import java.util.*;
class Add{
    public static void main(String args[]){
        int a = 0,b =0;
        Scanner sc = new Scanner(System.in);
        //Prompt user to Enter 1st number
        System.out.print("Enter 1st number : ");
        a = sc.nextInt();
        //Prompt user to Enter 2nd number
        System.out.print("Enter 2nd number : ");
        b = sc.nextInt();
        //Add a + b and store in c
        int c = a +b;
        //Display c
        System.out.println("Sum is "+c);
    }
}