public class NestedException2 {
    public static void main(String args[]){
        try{
            System.out.println("Outer try block - Stmt - 1");
            try{
                System.out.println("Inner try block - Stmt - 1");
                System.out.println(10/0);
                System.out.println("Inner try block - Stmt - 2");
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("Inner catch block..");
            }
            finally{
                System.out.println("Inner finally block..");
            }
            System.out.println("Outer try block - Stmt - 2");
        }
        catch(Exception e){
            System.out.println("Outer catch block..");
        }
        finally{
            System.out.println("Outer finally block");
        }
    }
}
