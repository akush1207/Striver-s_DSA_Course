package Array;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] nums=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Three Sum:"+threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;
        for(int i=0;i<len;i++) {
            if(i!=0&&nums[i]==nums[i-1]) {
                continue;
            }
            int j=i+1,k=len-1;
            while(j<k) {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0) {
                    k--;
                }else if(sum<0) {
                    j++;
                }else {
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                    temp.sort(null);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k&&nums[j]==nums[j-1]) j++;
                    while(j<k&&nums[k]==nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
}
