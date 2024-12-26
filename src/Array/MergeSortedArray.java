package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st array length:");
        int m=sc.nextInt();
        System.out.print("Enter 2nd array length:");
        int n=sc.nextInt();
        int[] nums1=new int[m+n];
        System.out.print("Enter 1st array elements:");
        for(int i=0;i<m;i++){
            nums1[i]=sc.nextInt();
        }
        int[] nums2=new int[n];
        System.out.print("Enter 2nd array elements:");
        for(int i=0;i<n;i++){
            nums2[i]=sc.nextInt();
        }
        merge(m,nums1,n,nums2);
        System.out.println("nums1:"+ Arrays.toString(nums1));
    }
    public static void merge(int m,int[] nums1,int n,int[] nums2){
        int ind=m+n-1;
        int i=m-1,j=n-1;
        while (j>=0){
            if(i>0 && nums1[i]>=nums2[j]){
                nums1[ind--]=nums1[i--];
            }else{
                nums1[ind--]=nums2[j--];
            }
        }
    }
}
