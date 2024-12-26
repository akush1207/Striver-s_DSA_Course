package Array;

import java.util.Scanner;

public class CountInversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Number of inversion:"+countInversion(nums));
    }
    public static int countInversion(int[] nums){
        int[] temp=new int[nums.length];
        return mergeAndCount(nums,temp,0,nums.length-1);
    }
    public static int mergeAndCount(int[] arr, int[] temp, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = (left + right) / 2;
        int invCount = 0;
        invCount += mergeAndCount(arr, temp, left, mid);
        invCount += mergeAndCount(arr, temp, mid + 1, right);
        invCount += merge(arr, temp, left, mid, right);
        return invCount;
    }

    static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        int invCount = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
        return invCount;
    }
}
