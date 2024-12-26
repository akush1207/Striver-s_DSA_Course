package Array;
import java.util.Scanner;
import java.util.ArrayList;
public class MissingAndRepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Missing and Repeating:"+missingRepeating(nums));
    }
    public static ArrayList<Integer> missingRepeating(int[] arr){
        int n = arr.length;
        // To store the missing and repeating numbers
        int missing = 0, repeating = 0;
        // Use the array elements themselves to mark visited numbers
        for (int i = 0; i < n; i++) {
            int absValue = Math.abs(arr[i]);
            // If the value at index absValue - 1 is negative, it is a duplicate
            if (arr[absValue - 1] < 0) {
                repeating = absValue;
            } else {
                // Mark the index as visited
                arr[absValue - 1] = -arr[absValue - 1];
            }
        }
        // The index corresponding to the positive value is the missing number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
            }
        }
        // Return the result
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(missing);
        ans.add(repeating);
        return ans;
    }
}
