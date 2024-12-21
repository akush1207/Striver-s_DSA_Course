package DynamicProgramming;
import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length:");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.print("Enter array elements:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Recursive Solution:"+rec(arr,len-1));
        int[] dp=new int[len+1];
        Arrays.fill(dp,-1);
        System.out.println("Memoization Solution:"+memo(arr,dp,len-1));
        System.out.println("Tabulation Solution:"+tabulation(arr));
        System.out.println("Space Optimized Solution:"+spaceOptimization(arr));
    }
    public static int rec(int[] arr,int n){
        if(n==0){
            return arr[n];
        }
        if(n<0){
            return 0;
        }
        int pick=arr[n]+rec(arr,n-2);
        int notPick= rec(arr, n - 1);
        return Math.max(pick,notPick);
    }
    public static int memo(int[] arr,int[] dp,int n){
        if(n==0){
            return arr[n];
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int pick=arr[n]+memo(arr,dp,n-2);
        int notPick=memo(arr,dp,n-1);
        return dp[n]=Math.max(pick,notPick);
    }
    public static int tabulation(int[] arr){
        int n=arr.length;
        int[] dp=new int[n+1];
        dp[0]=arr[0];
        for(int i=1;i<n;i++){
            int pick=arr[i];
            if(i>1){
                pick+=dp[i-2];
            }
            int notPick=dp[i-1];
            dp[i]=Math.max(pick,notPick);
        }
        return dp[n-1];
    }
    public static int spaceOptimization(int[] arr){
        int prev1=arr[0];
        int prev2=0;
        for(int i=1;i<arr.length;i++){
            int pick=arr[i]+prev2;
            int notPick=prev1;
            int curr=Math.max(pick,notPick);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
