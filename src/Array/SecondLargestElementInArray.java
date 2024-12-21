package Array;

import java.util.Scanner;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        System.out.print("Enter array elements:");
        int[] nums=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Second Largest:"+secondLargest(nums));

    }
    public static int secondLargest(int[] nums){
        int largest1=Integer.MIN_VALUE,largest2=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>largest1){
                largest2=largest1;
                largest1=num;
            }else if(num>largest2 && num<largest1){
                largest2=num;
            }
        }
        return largest2==Integer.MIN_VALUE?largest1:largest2;
    }
}
