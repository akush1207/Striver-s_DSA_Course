package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfBeautyOfAllSubstrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();
        System.out.println("Beauty Sum:"+beautySumBrute(s));
        System.out.println("Beauty Sum:"+beautySumOptimum(s));
    }
    public static int beautySumBrute(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String substring=s.substring(i,j+1);
                HashMap<Character,Integer> map=new HashMap<>();
                for(int k=0;k<substring.length();k++){
                    char ch=substring.charAt(k);
                    map.put(ch,map.getOrDefault(ch,0)+1);
                }
                int max=0,min=substring.length();
                for(Map.Entry<Character,Integer> entry:map.entrySet()){
                    max=Math.max(max,entry.getValue());
                    min=Math.min(min,entry.getValue());
                }
                sum+=(max-min);
            }
        }
        return sum;
    }
    public static int beautySumOptimum(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch-'a']++;
                int max=0,min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        max=Math.max(max,freq[k]);
                        min=Math.min(min,freq[k]);
                    }
                }
                sum+=(max-min);
            }
        }
        return sum;
    }
}
