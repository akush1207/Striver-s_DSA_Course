package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.println("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter k:");
        int k=sc.nextInt();
        rotate(nums,k);
        System.out.println("nums:"+ Arrays.toString(nums));
    }
    public static void rotate(int[] nums,int k){
        int len=nums.length;
        k%=len;
        reverse(0,len-1,nums);
        reverse(0,k-1,nums);
        reverse(k,len-1,nums);
    }
    public static void reverse(int low,int high,int[] nums){
        for(int i=low,j=high;i<j;i++,j--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}
