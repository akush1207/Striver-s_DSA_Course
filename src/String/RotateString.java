package String;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the both string:");
        String s= sc.next();
        String goal=sc.next();
        System.out.println("Is rotated:"+isRotated(s,goal));
    }
    public static boolean isRotated(String s,String goal){
        if(s.length()!=goal.length()){
            return false;
        }
        StringBuilder sb=new StringBuilder(s);
        sb.append(s);
        return sb.indexOf(goal)!=-1;
    }
}
