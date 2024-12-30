package String;

import java.util.Scanner;
import java.util.Arrays;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of words:");
        int n=sc.nextInt();
        String[] str=new String[n];
        System.out.println("Enter the words:");
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        System.out.println("Longest Common Prefix:"+longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] str) {
        if(str.length==1){
            return str[0];
        }
        Arrays.sort(str);
        int i=0;
        String first=str[0],last=str[str.length-1];
        int lastIndex=Math.min(first.length(),last.length());
        String ans="";
        while(i<lastIndex){
            if(first.charAt(i)!=last.charAt(i)){
                return ans;
            }else{
                ans+=first.charAt(i);
            }
            i++;
        }
        return ans;
    }
}
