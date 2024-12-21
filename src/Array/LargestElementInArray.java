package Array;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=sc.nextInt();
        System.out.println("Enter array elements:");
        int[] nums=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Largest Element:"+largestElement(nums));
    }
    public static int largestElement(int[] nums){
        int largest=Integer.MIN_VALUE;
        for(int num:nums){
            largest=Math.max(largest,num);
        }
        return largest;
    }
}
