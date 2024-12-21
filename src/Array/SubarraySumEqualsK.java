package Array;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {
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
        System.out.println("Number of subarray with sum "+k+" : "+subarraySumKBrute(nums,k));
        System.out.println("Number of subarray with sum "+k+" : "+subarraySumKOptimum(nums,k));
    }
    public static int subarraySumKBrute(int[] nums,int k){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            if(sum==k){
                ans++;
            }
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static int subarraySumKOptimum(int[] nums,int k){
        HashMap<Integer,Integer> prefixSum=new HashMap<>();
        prefixSum.put(0,1);
        int currSum=0,count=0;
        for(int num:nums){
            currSum+=num;
            if(prefixSum.containsKey(currSum-k)){
                count+=prefixSum.get(currSum-k);
            }
            prefixSum.put(currSum,prefixSum.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}
