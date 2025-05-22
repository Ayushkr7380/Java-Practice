public class ArrayException {
    public static void main(String[] args) {
        //Declare and initialize number array
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Trying to access an invalid index
            System.out.println("Element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds.");
        } finally {
            System.out.println("Array access attempt completed.");
        }
    }
}
