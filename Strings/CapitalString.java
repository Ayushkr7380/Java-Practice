import java.util.*;
public class CapitalString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Prompt user to enter a string
        System.out.print("Enter any string : ");
        String str1 = sc.nextLine();

        //Capital the string 

        System.out.println("String in capital is "+str1.toUpperCase());
        
    }
}
