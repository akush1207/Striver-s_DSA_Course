package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.println("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        int ind=removeDuplicates(nums);
        System.out.println("Array after removing duplicates:"+ Arrays.toString(Arrays.copyOfRange(nums,0,ind+1)));
    }
    public static int removeDuplicates(int[] nums){
        int ind=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[++ind]=nums[i];
            }
        }
        return ind;
    }
}
