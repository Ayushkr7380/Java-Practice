import java.util.Scanner;

public class PasswordValidation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pwd = sc.nextLine();
        sc.close();

        if (isValidPassword(pwd)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password must contain at least 1 lowercase letter, 1 uppercase letter, 1 special character, 1 number, and be longer than 7 characters.");
        }
    }

    public static boolean isValidPassword(String pwd) {
        if (pwd.length() < 8) {
            return false;
        }

        boolean hasLower = false, hasUpper = false, hasNumber = false, hasSpecial = false;
        String specialCharacters = "!@#$%^&*()-+=<>?/{}[]|\\:;\"'`~,._";

        for (char ch : pwd.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if (specialCharacters.contains(String.valueOf(ch))) {
                hasSpecial = true;
            }
        }

        return hasLower && hasUpper && hasNumber && hasSpecial;
    }
}
