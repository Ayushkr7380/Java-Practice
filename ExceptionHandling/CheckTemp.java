import java.util.Scanner;
class CustomTempException extends Exception{

    public CustomTempException(String message) {
        super(message);
    }
    
}
public class CheckTemp{
    public static void main(String args[]) throws CustomTempException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature : ");
        int temp = sc.nextInt();

        if(temp < 15){
            throw new CustomTempException("Temperature Below Normal.");
        }
        else if(temp >= 15 && temp <= 42){
            throw new CustomTempException("Temperature Normal.");
        }
        else if(temp > 42){
            throw new CustomTempException("Temperature is High.");
        }
    }
}