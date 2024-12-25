package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int numRows=sc.nextInt();
        System.out.println("Pascal Triangle:"+pascalTriangle(numRows));
    }
    public static List<List<Integer>> pascalTriangle(int numRows){
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0|| j==i){
                    temp.add(1);
                }else{
                    temp.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                }
            }
            ans.add(new ArrayList<>(temp));
        }
        return ans;
    }
}
