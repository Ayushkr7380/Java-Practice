public class Matrix_2X2 {
    public static void main(String args[]){
        int mat1[][] = {{1,2},{54,6}};
        int mat2[][] = {{34,5},{1,78}};
        int mat3[][] = {{0,0},{0,0}};

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                mat3[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(" "+mat3[i][j]);
            }
            System.out.println("");
        }
    }
}
