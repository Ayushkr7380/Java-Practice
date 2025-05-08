interface Car{
    void drive();
    void fuel();
}
interface Bike{
    void ride(); 
}

public class InterfaceExample implements Car,Bike{
    public void drive(){
        System.out.println("I am driving.");        
    }
    public void fuel(){
        System.out.println("Fuel is full.");
    }
    public void ride(){
        System.out.println("I can ride bike.");
    }
    public static void main(String args[]){
        InterfaceExample i1 = new InterfaceExample();
        i1.drive();
        i1.fuel();
        i1.ride();
    }
}
