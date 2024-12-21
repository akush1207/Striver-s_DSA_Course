package Array;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of days:");
        int n=sc.nextInt();
        int[] prices=new int[n];
        System.out.print("Enter the prices of each day:");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println("Max Profit Brute:"+maxProfitBrute(prices));
        System.out.println("Max Profit Optimum:"+maxProfitOptimum(prices));

    }
    public static int maxProfitBrute(int[] prices){
        int ans=0,n=prices.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(prices[j]>prices[i]){
                    ans=Math.max(ans,prices[j]-prices[i]);
                }
            }
        }
        return ans;
    }
    public static int maxProfitOptimum(int[] prices){
        int ans=0;
        int minPrice=prices[0];
        for(int price:prices){
            minPrice=Math.min(price,minPrice);
            ans=Math.max(ans,price-minPrice);
        }
        return ans;
    }
}
