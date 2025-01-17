package String;

import java.util.Scanner;

public class MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();
        System.out.println("Max Depth:"+maxDepth(s));
    }
    public static int maxDepth(String s){
        int max=0;
        int currDepth=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                currDepth++;
                max=Math.max(max,currDepth);
            }else{
                currDepth--;
            }
        }
        return max;
    }
}
