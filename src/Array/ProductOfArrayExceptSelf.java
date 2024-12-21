package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Product Except Self:"+ Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums){
        int len= nums.length;
        int[] ans=new int[len];
        int prod=1;
        for(int i=0;i<len;i++){
            ans[i]=prod;
            prod*=nums[i];
        }
        prod=1;
        for(int i=len-1;i>=0;i--){
            ans[i]*=prod;
            prod*=nums[i];
        }
        return ans;









    }
}
