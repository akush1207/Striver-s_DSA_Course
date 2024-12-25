package Array;

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class FourSum {
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
        System.out.println("Four Sum:"+fourSum(nums,target));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;
        for(int i=0;i<len;i++) {
            if(i>1&&nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<len;j++) {
                if(j>(i+1) && nums[j]==nums[j-1]) continue;
                int k=j+1,l=len-1;
                while(k<l) {
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum==target) {
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        temp.sort(null);
                        if(!ans.contains(temp))
                            ans.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }else if(sum>target) {
                        l--;
                    }else {
                        k++;
                    }
                }
            }
        }
        return ans;
    }
}
