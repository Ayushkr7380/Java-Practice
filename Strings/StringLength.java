import java.util.*;
public class StringLength {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter any string : ");
    String str1 = sc.nextLine();

    int lengthOfString = str1.length();

    System.out.println("Length of "+str1+" is "+lengthOfString);
}  
}
