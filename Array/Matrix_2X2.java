public class Matrix_2X2 {
    public static void main(String args[]){
        int mat1[][] = {{1,2},{54,6}};
        int mat2[][] = {{34,5},{1,78}};
        int matAdd[][] = {{0,0},{0,0}};
        int matMul[][] = {{0,0},{0,0}};

        //For matrix addition
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matAdd[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        //For matrix multiplication
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matMul[i][j] = mat1[i][j] * mat2[i][j];
            }
        }

        System.out.println("Sum of two matrix is : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(" "+matAdd[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Product of two matrix is : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(" "+matMul[i][j]);
            }
            System.out.println("");
        }
    }
}
