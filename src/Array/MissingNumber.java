package Array;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.println("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Missing Number:"+missingNumber(nums));
    }
    public static int missingNumber(int[] nums){
        int len=nums.length;
        int totalSum=(len*(len+1))/2;
        int currSum=0;
        for(int num:nums){
            currSum+=num;
        }
        return totalSum-currSum;
    }
}
