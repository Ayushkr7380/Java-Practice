class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}
public class CustomException1{
    public static void main(String args[]) throws MyException{
        int age = 15;
        if(age < 18){
            throw new MyException("Age is below 18.You are not eligible.");
        }

        System.out.println("You are eligible.");
    }
}