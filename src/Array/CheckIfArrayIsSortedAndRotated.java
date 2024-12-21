package Array;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        System.out.print("Enter array elements:");
        int[] nums=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Is sorted and rotated:"+isSortedAndRotated(nums));
    }
    public static boolean isSortedAndRotated(int[] nums){
        int len=nums.length;
        int[] temp=Arrays.copyOf(nums,len);
        Arrays.sort(temp);
        for(int i=0;i<len;i++){
            boolean isMatch=true;
            for(int j=0;j<len;j++){
                if(temp[(i+j)%len]!=nums[j]){
                    isMatch=false;
                    break;
                }
            }
            if(isMatch){
                return true;
            }
        }
        return false;
    }
}
