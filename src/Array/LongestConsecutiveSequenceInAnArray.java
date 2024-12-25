package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSequenceInAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Longest Sequence:"+longestSequence(arr));
    }
    public static int longestSequence(int[] arr){
        Arrays.sort(arr);
        int maxLength=0,lastSmaller=Integer.MIN_VALUE,count=0;
        for(int a:arr){
            if(a-1==lastSmaller){
                count++;
                lastSmaller=a;
            }else if(a!=lastSmaller){
                count=1;
                lastSmaller=a;
            }
            maxLength=Math.max(maxLength,count);
        }
        return maxLength;
    }
}
