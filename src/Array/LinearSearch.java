package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.println("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int ele=sc.nextInt();
        System.out.println("Is "+ele+" present in the array? :"+linearSearch(nums,ele));
    }
    public static boolean linearSearch(int[] nums,int ele){
        for(int num:nums){
            if(num==ele){
                return true;
            }
        }
        return false;
    }
}
