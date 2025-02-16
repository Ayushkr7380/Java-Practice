public class ReverseStringUsingFunction {
    public static void main(String args[]){
        String str1 = "hello";
        StringBuilder str2 = new StringBuilder(str1).reverse();
        System.out.println("String is "+str1);
        System.out.println("Reversed String is "+str2);
    }
}
