public class PalindromeString {
    public static void main(String args[]){
        String str1 = "madam";
        String str2 = new StringBuilder(str1).reverse().toString();
        if(str1.equals(str2)){
            System.out.println(str1+" string is palindrome.");
        }
        else{
            System.out.println(str1+" string is not palindrome.");
            
        }
    }
}
