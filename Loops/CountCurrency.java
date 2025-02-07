import java.util.*;
public class CountCurrency {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the amount : ");
        int money = sc.nextInt();

        int denominations[] = {2000,500,200,100,50,20,10,5,2,1};
        int count[] = new int[denominations.length];

        for(int i=0;i<denominations.length;i++){
            count[i] = money / denominations[i]; //Calculate number of notes 
            money = money % denominations[i];
        }

        for(int i=0;i<denominations.length;i++){
            if(count[i]>0){
                System.out.println(denominations[i]+" : "+count[i]);
            }
        }
    }
}
