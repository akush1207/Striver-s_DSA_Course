package Array;

import java.util.Scanner;

public class SingleNUmber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.println("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Single Number:"+singleNumber(nums));
    }
    public static int singleNumber(int[] nums){
        int ans=0;
        for(int num:nums){
            ans^=num;
        }
        return ans;
    }
}
