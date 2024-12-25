package Array;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class MajorityElementII {
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
    public static List<Integer> majorityElement(int[] nums){
        int count1=0,count2=0,ele1=0,ele2=0;
        for(int num:nums){
            if(count1==0 && num!=ele2){
                count1=1;
                ele1=num;
            }else if(count2==0 && num!=ele1){
                count2=1;
                ele2=num;
            }else if(num==ele1){
                count1++;
            }else if(num==ele2){
                count2++;
            }
        }
        count2=count1=0;
        for(int num:nums){
            if(num==ele1){
                count1++;
            }else if(num==ele2){
                count2++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        if(count1>nums.length/3){
            ans.add(ele1);
        }
        if(count2>nums.length/3){
            ans.add(ele2);
        }
        return ans;
    }
}
