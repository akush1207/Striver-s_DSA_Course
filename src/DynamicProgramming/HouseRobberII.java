package DynamicProgramming;
import java.util.Arrays;
import java.util.Scanner;

public class HouseRobberII {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Rob:"+rob(arr));
    }
    public static int rob(int[] arr){
        if(arr.length==0){
            return 0;
        }
        if(arr.length==1){
            return arr[0];
        }
        if(arr.length==2){
            return Math.max(arr[0],arr[1]);
        }
        int ans1=helper(arr,0,arr.length-2);
        int ans2=helper(arr,1,arr.length-1);
        return Math.max(ans2,ans1);
    }
    public static int helper(int[] arr,int start,int end){
        int prev1=0,prev2=0;
        for(int i=start;i<=end;i++){
            int curr=Math.max(arr[i]+prev2,prev1);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
