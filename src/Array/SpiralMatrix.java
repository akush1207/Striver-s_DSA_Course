package Array;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class SpiralMatrix {
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
        System.out.println("Spiral Order:"+spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int right=matrix[0].length-1,bottom=matrix.length-1,left=0,top=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while (top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
            }
            left++;
        }
        return ans;
    }
}
