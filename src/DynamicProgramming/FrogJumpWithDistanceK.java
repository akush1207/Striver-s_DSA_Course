package DynamicProgramming;
import java.util.Arrays;
import java.util.Scanner;

public class FrogJumpWithDistanceK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter k:");
        int k=sc.nextInt();
        System.out.println("Energy Used:"+energyUsed(arr,k));
    }
    public static int energyUsed(int[] arr,int k){
        int[] dp=new int[arr.length];
        Arrays.fill(dp,-1);
        return memo(dp,arr,k,arr.length-1);
    }
    public static int memo(int[] dp,int[]arr,int k,int n){
        if(n==0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int minEnergyUsed=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(n-i >=0){
                int currCost=memo(dp,arr,k,n-i)+Math.abs(arr[i]-arr[n-i]);
                minEnergyUsed=Math.min(minEnergyUsed,currCost);
            }
        }
        return dp[n]=minEnergyUsed;
    }
}
