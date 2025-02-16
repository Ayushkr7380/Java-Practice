public class InsertString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.insert(4, " Programming"); 
        System.out.println(sb); // Output: Java Programming
    }
}
