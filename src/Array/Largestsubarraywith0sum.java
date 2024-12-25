package Array;

import java.util.HashMap;
import java.util.Scanner;

public class Largestsubarraywith0sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Largest Subarray length with sum 0 is "+largestSubarray(nums)+".");
    }
    public static int largestSubarray(int[] nums){
        int maxLen=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum==0){
                maxLen=i+1;
            }
            if(map.containsKey(currSum)){
                maxLen=Math.max(maxLen,i-map.get(currSum));
            }else{
                map.put(currSum,i);
            }
        }
        return maxLen;
    }
}
