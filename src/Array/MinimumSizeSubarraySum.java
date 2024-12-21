package Array;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter target:");
        int target=sc.nextInt();
        System.out.println("Minimum Subarray Length with sum "+target+" : "+minimumSubarrayWithSumK(nums,target));
    }
    public static int minimumSubarrayWithSumK(int[] nums,int target){
        int minLength=Integer.MAX_VALUE;
        int start=0,currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            while (currSum>=target){
                minLength=Math.min(minLength,i-start+1);
                currSum-=nums[start++];
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}
