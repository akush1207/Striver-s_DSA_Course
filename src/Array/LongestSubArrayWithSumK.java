package Array;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter k:");
        int k=sc.nextInt();
        System.out.println("Longest Subarray with sum "+k+" : "+longestSubarray(nums,k));
    }
    public static int longestSubarray(int[] nums,int k){
        int maxLength=0;
        int currSum=0;
        HashMap<Integer,Integer> prefixSum=new HashMap<>();
        prefixSum.put(0,-1);
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(prefixSum.containsKey(currSum-k)){
                maxLength=Math.max(maxLength,i-prefixSum.get(currSum-k));
            }
            if(!prefixSum.containsKey(currSum)){
                prefixSum.put(currSum,i);
            }
        }
        System.out.println("Prefix Sum:"+prefixSum);
        return maxLength;
    }
}
