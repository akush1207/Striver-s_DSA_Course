package Array;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLeaders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("ans:"+leaders(arr));
    }
    public static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        int leader=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            if(arr[i-1]>=leader){
                ans.add(0,leader);
                leader=arr[i-1];
            }
        }
        ans.add(0,leader);
        return ans;
    }
}
