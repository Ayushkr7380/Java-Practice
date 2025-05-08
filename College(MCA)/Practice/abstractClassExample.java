abstract class Boy{
    abstract void sing();
    public void fight(){
        System.out.println("This boy can fight.");
    };
}
public class abstractClassExample extends Boy{
    public void sing(){
        System.out.println("He is a god damn singer.");
    }

    public static void main(String args[]){
        abstractClassExample ab = new abstractClassExample();
        ab.fight();
        ab.sing();
    }
}
