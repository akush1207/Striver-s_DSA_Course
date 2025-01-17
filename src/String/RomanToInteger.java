package String;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();
        System.out.println("Roman to Integer:"+romanToInt(s));
    }
    public static int romanToInt(String s) {
        int ans=0,i=s.length()-1;
        while (i>=0){
            char ch=s.charAt(i);
            if(ch=='I'){
                ans+=1;
                i--;
            }else if(ch=='V'){
                if(i>0 && s.charAt(i-1)=='I'){
                    ans+=4;
                    i-=2;
                }else{
                    ans+=5;
                    i--;
                }
            }else if(ch=='X'){
                if(i>0 && s.charAt(i-1)=='I'){
                    ans+=9;
                    i-=2;
                }else{
                    ans+=10;
                    i--;
                }
            }else if(ch=='L'){
                if(i>0 && s.charAt(i-1)=='X'){
                    ans+=40;
                    i-=2;
                }else{
                    ans+=50;
                    i--;
                }
            }else if(ch=='C'){
                if(i>0 && s.charAt(i-1)=='X'){
                    ans+=90;
                    i-=2;
                }else{
                    ans+=100;
                    i--;
                }
            }else if(ch=='D'){
                if(i>0 && s.charAt(i-1)=='C'){
                    ans+=400;
                    i-=2;
                }else{
                    ans+=500;
                    i--;
                }
            }else if(ch=='M'){
                if(i>0 && s.charAt(i-1)=='C'){
                    ans+=900;
                    i-=2;
                }else{
                    ans+=1000;
                    i--;
                }
            }
        }
        return ans;
    }
}
