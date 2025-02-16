public class ReplaceString{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.replace(6, 11, "Java"); // Replaces "World" with "Java"
        System.out.println(sb); // Output: Hello Java
    }
}
