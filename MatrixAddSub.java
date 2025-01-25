import java.util.Scanner; 
public class MatrixAddSub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the no.of columns:");
        int cols=sc.nextInt();
        int[][] mat1=new int[rows][cols];
        int[][] mat2=new int[rows][cols];
        int[][] add=new int[rows][cols];
        int[][] sub=new int[rows][cols];
        System.out.println("Enter elements of 1st matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of 2nd matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                add[i][j]=mat1[i][j]+mat2[i][j];
                sub[i][j]=mat1[i][j]-mat2[i][j];
            }
            System.out.println();
        }
        System.out.println("Matrix Addition:");
        // System.out.println(add);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix Substraction:");
        // System.out.println(sub);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }
}
