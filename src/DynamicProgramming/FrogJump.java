package DynamicProgramming;
import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class FrogJump {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the energy:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Energy Lost:"+energyLost(arr,n));
    }
    public static int energyLost(int[] arr,int n){
        /*int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return memo(dp,arr,n-1);*/
        //return tab(arr,n);
        return spaceOptimisation(arr,n);
    }
    public static int memo(int[] dp,int[] arr,int i){
        if(i==0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int twoJump=Integer.MAX_VALUE;
        int oneJump=memo(dp,arr,i-1)+Math.abs(arr[i]-arr[i-1]);
        if(i>1){
            twoJump=memo(dp,arr,i-2)+Math.abs(arr[i]-arr[i-2]);
        }
        return dp[i]=Math.min(oneJump,twoJump);
    }
    public static int tab(int[] arr,int n){
        int[] dp=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            int twoJump=Integer.MAX_VALUE;
            int oneJump=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
            if(i>1){
                twoJump=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
            }
            dp[i]=Math.min(oneJump,twoJump);
        }
        return dp[n-1];
    }
    public static int spaceOptimisation(int[] arr,int n){
        int prev1=0,prev2=0;
        for(int i=1;i<n;i++){
            int oneJump=prev1+Math.abs(arr[i-1]-arr[i]);
            int twoJump=Integer.MAX_VALUE;
            if(i>1){
                twoJump=prev2+Math.abs(arr[i-2]-arr[i]);
            }
            int curr=Math.min(oneJump,twoJump);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
