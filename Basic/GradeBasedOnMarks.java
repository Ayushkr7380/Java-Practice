import java.util.*;
public class GradeBasedOnMarks{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any marks : ");
        int num = sc.nextInt();

        int grade = num / 10;
        switch(grade){
            case 10 :
            case 9: System.out.println("Grade A.");break;
            case 8 : System.out.println("Grade B.");break;
            case 7 : System.out.println("Grade C.");break;
            case 6 : System.out.println("Grade D.");break;
            case 5 : System.out.println("Grade E.");break;
            
            default:System.out.println("Failed.");break;
        }
    }
}