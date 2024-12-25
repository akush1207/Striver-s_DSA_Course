package Array;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Majority Element:"+majorityElement(nums));
    }
    public static int majorityElement(int[] nums){
        int ans=nums[0];
        int count=0;
        for (int num:nums){
            if(count==0){
                count=1;
                ans=num;
            }else if(ans==num){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        for(int num:nums){
            if(num==ans){
                count++;
            }
        }
        return count>(nums.length/2)?ans:-1;
    }
}
