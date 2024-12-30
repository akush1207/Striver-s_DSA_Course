package String;

import java.util.Scanner;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.nextLine();
        System.out.println("s:"+reverseWords(s));
    }
    public static String reverseWords(String s) {
        String ans="",temp="";
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if (ch!=' '){
                temp += ch;
            }else {
                if (!ans.isEmpty()){
                    if(!temp.isEmpty())
                        ans = temp + " " + ans;
                }else{
                    ans = temp;
                }
                temp = "";
            }
        }
        if (!temp.isEmpty()){
            if (!ans.isEmpty()){
                    ans = temp + " " + ans;
            }else{
                ans = temp;
            }
        }
        return ans;
    }
}
