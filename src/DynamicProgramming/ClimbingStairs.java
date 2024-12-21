package DynamicProgramming;
import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println("Climb Stairs:"+climbStairs(n));
    }
    public static int climbStairs(int n){
        int prev2=1,prev1=1;
        for(int i=2;i<=n;i++){
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
