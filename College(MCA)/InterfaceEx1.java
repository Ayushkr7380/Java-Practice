// Define an interface named Human with two abstract methods
interface Human {
    void longHair();      // Method to describe hair characteristic
    void smartness();     // Method to describe smartness
}

// Implement the Human interface in the Girl class
class Girl implements Human {
    
    // Override the longHair method to provide implementation
    @Override
    public void longHair() {
        System.out.println("This girl has long hair.");
    }

    // Override the smartness method to provide implementation
    @Override
    public void smartness() {
        System.out.println("This girl is very smart.");
    }
}

// Main class to run the program
class InterfaceEx1 {
    public static void main(String args[]) {
        // Create an object of Girl class
        Girl ayushi = new Girl();

        // Call the implemented methods using the object
        ayushi.longHair();     // Output: This girl has long hair.
        ayushi.smartness();    // Output: This girl is very smart.
    }
}
