import java.util.*;

//Perfom Addition
class Addition{
    int num1,num2;
    Addition(int n1,int n2){
        num1 = n1;
        num2 = n2;        
    }
    int addition(){
        return num1+num2;
    }
}

//Perform Subtraction
class Subtraction{
    int num1,num2;
    Subtraction(int n1,int n2){
        num1 = n1;
        num2 = n2;
    }
    int sub(){
        return (num1 - num2);
    }
}

//Perform Multiplication 
class Multiplication{
    int num1,num2;
    Multiplication(int n1,int n2){
        num1 = n1;
        num2 = n2;
    }
    int mul(){
        return (num1 * num2);
    }
}

//Perform Division
class Division{
    int num1,num2;
    Division(int n1,int n2){
        num1 = n1;
        num2 = n2;
    }
    int div(){
        return (num1 / num2);
    }
}

public class UserInput {
    public static void main(String args[]){
        int num1,num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        num1 = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        num2 = sc.nextInt();

        Addition add = new Addition(num1, num2);
        Subtraction sub = new Subtraction(num1, num2);
        Multiplication mul = new Multiplication(num1, num2);
        Division div = new Division(num1, num2);
        
        System.out.println("Sum is "+add.addition());
        System.out.println("Minus is "+sub.sub());
        System.out.println("Multiple is "+mul.mul());
        System.out.println("Divide is "+div.div());
    }
}
