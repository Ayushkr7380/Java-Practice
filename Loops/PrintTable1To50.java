class PrintTable1To50{
    public static void main(String args[]){
        int n = 1;
        while(n<=50){
            for(int i=1;i<=10;i++){
                System.out.println(n+" X "+i+" = "+(n*i));
            }
            System.out.println("\t");
            n++;
        }

    }
}