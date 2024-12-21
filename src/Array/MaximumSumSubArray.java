package Array;

import java.util.Scanner;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter the array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Maximum Sum SubArray:"+maxSumSubArray(nums));
    }
    public static int maxSumSubArray(int[] nums){
        int maxSum=0,currSum=0;
        for(int num:nums){
            currSum+=num;
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
