import java.util.*;
class Circle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius : ");
        double radius = sc.nextDouble();

        System.out.println("Area of circle is "+(3.14 * radius * radius));
    }
}