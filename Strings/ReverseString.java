import java.util.*;
public class ReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Prompt user to enter any string 
        System.out.print("Enter any string : ");
        String str1 = sc.nextLine();

        // Reverse the string using a loop
        String reversed = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed += str1.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
