package String;

import java.util.Scanner;

public class LargestOddNumberinString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        String num=sc.next();
        System.out.println("Largest Odd Number:"+largestOddNumber(num));
    }
    public static String largestOddNumber(String num){
        int ind= num.lastIndexOf('1');
        ind=Math.max(ind,num.lastIndexOf('3'));
        ind=Math.max(ind,num.lastIndexOf('5'));
        ind=Math.max(ind,num.lastIndexOf('7'));
        ind=Math.max(ind,num.lastIndexOf('9'));
        return ind==-1?"":num.substring(0,ind+1);
    }
}
