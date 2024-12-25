package Array;

import java.util.Scanner;

public class StockBuyAndSell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of days :");
        int days=sc.nextInt();
        int[] prices=new int[days];
        System.out.print("Enter price of each day:");
        for(int i=0;i<days;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println("Maximum Profit:"+buyAndSell(prices));
    }
    public static int buyAndSell(int[] prices){
        int maxProfit=0,minPrice=Integer.MAX_VALUE;
        for(int price:prices){
            minPrice=Math.min(minPrice,price);
            maxProfit=Math.max(maxProfit,price-minPrice);
        }
        return maxProfit;
    }
}
