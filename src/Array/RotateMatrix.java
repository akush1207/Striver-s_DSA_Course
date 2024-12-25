package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row and column of the matrix:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.print("Enter matrix elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        rotate(matrix);
        System.out.println("Matrix:"+ Arrays.deepToString(matrix));
    }
    public static void rotate(int[][] matrix){
        transpose(matrix);
        for(int [] mat:matrix){
            for(int i=0,j=mat.length-1;i<j;i++,j--){
                int temp=mat[i];
                mat[i]=mat[j];
                mat[j]=temp;
            }
        }
    }
    public static void transpose(int[][] matrix){
        int row=matrix.length,col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
