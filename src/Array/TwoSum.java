package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter the array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter the target sum:");
        int target=sc.nextInt();
        System.out.println("Two Sum Brute:"+ Arrays.toString(twoSumBrute(nums,target)));
        System.out.println("Two Sum Optimum:"+Arrays.toString(twoSumOptimum(nums,target)));
    }
    public static int[] twoSumBrute(int[] nums,int target){
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }
    public static int[] twoSumOptimum(int[] nums,int target){
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[0]=map.get(target-nums[i]);
                ans[1]=i;
                break;
            }else{
                map.put(nums[i],i);
            }
        }
        return ans;
    }
}
