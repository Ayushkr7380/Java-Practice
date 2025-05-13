// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class that inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();   // Inherited method
        myDog.bark();  // Child's own method
    }
}
