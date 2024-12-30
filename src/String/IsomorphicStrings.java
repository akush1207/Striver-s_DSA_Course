package String;

import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the both string:");
        String s=sc.next();
        String t=sc.next();
        System.out.println("Is isomorphic:"+isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] map1=new int[200];
        int[] map2=new int[200];
        for(int i=0;i<s.length();i++){
            if(map1[s.charAt(i)]!=map2[t.charAt(i)]){
                return false;
            }
            map1[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;
        }
        return true;
    }
}
