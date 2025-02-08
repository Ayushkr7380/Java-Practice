public class Prime1To100 {
    public static void main(String args[]){
        int n = 1,prime;
        while(n<=100){
            prime = 0;
            for(int i=2;i<=n/2;i++){
                if( n % i == 0){
                    prime = 1;
                    break;
                }
            }
            if(prime == 0){
                System.out.println(n+" is a prime number.");
            }
            n++;
        }
    }
}
