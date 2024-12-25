package Array;

import java.util.HashMap;
import java.util.Scanner;

public class CountnumberofsubarrayswithgivenxorK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter the target:");
        int target=sc.nextInt();
        System.out.println("Total subarray with XOR "+target+" is "+countSubarray(nums,target)+".");
    }
    public static int countSubarray(int[] nums,int target){
        int maxLen=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int currXOR=0;
        map.put(0,1);
        for (int num : nums) {
            currXOR ^= num;
            if (map.containsKey(currXOR ^ target)) {
                maxLen += map.get(currXOR ^ target);
            }
            map.put(currXOR, map.getOrDefault(currXOR, 0) + 1);
        }
        return maxLen;
    }
}
