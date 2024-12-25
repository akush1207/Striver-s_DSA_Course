package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZero {
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
        setZero(matrix);
        System.out.println("Matrix:"+ Arrays.deepToString(matrix));
    }
    public static void setZero(int[][] matrix){
        int col0=1,row=matrix.length,col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0){
                        matrix[0][j]=0;
                    }else{
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int i=0;i<col;i++){
                matrix[0][i]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<row;i++){
                matrix[i][0]=0;
            }
        }
    }
}
