import java.util.*;

public class TransposeMatrix {

    static void Printtranspose(int [][] matrix){
        for(int i=0; i<matrix.length ; i++){
            for(int j=0; j<matrix[i].length ; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int [][] Findtranspose(int [][] matrix, int r, int c){
        int[][] ans = new int[c][r];

        for(int i =0;i<c; i++){
            for (int j =0; j<r;  j++){
                ans[i][j]= matrix[j][i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix ");
        int r  = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r*c;
        System.out.println("Enter"+ totalElements + "values");
        for(int i = 0; i<r; i++){
            for(int j= 0; j<c; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        Printtranspose(matrix);

        System.out.println("Transpose of matrix");
        int[][] ans = Findtranspose(matrix, r, c);
        Printtranspose(ans);
    }
    
}
