package Array;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.println("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Max Consecutive Ones:"+maxConsecutiveOnes(nums));
    }
    public static int maxConsecutiveOnes(int[] nums){
        int currCount=0,maxCount=0;
        for(int num:nums){
            if(num==1){
                currCount++;
            }else{
                maxCount=Math.max(maxCount,currCount);
                currCount=0;
            }
        }
        maxCount=Math.max(maxCount,currCount);
        return maxCount;
    }
}
