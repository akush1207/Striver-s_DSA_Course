package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Rearranged array:"+ Arrays.toString(rearrange(nums)));
    }
    public static int[] rearrange(int[] nums){
        int[] ans=new int[nums.length];
        int evenIndex=0,oddIndex=1;
        for(int num:nums){
            if(num>0){
                ans[evenIndex]=num;
                evenIndex+=2;
            }else if(num<0){
                ans[oddIndex]=num;
                oddIndex+=2;
            }
        }
        return ans;
    }
}
