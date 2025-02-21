import java.util.*;
public class PasswordValidation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password : ");
        String pwd = sc.nextLine();
        sc.close();
        if(pwd.length() < 8){
            System.out.println("length of password should be greater than 7.");
        }
        else{
            System.out.println("Length of password is ok.");
        }
    }
}