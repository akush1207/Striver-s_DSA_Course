package DynamicProgramming;
import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("fib("+n+"):"+fibMemo(n,dp));
        System.out.println("fib("+n+"):"+fibTab(n));
        System.out.println("fib("+n+"):"+fib(n));
    }
    public static int fibMemo(int n,int[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fibMemo(n-1,dp)+fibMemo(n-2,dp);
    }
    public static int fibTab(int n){
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        int prev2=0,prev1=1;
        for(int i=2;i<=n;i++){
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
