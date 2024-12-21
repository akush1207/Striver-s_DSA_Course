package Array;
import java.util.Scanner;
import java.util.ArrayList;
public class UnionOfTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st array length:");
        int len1=sc.nextInt();
        int[] a=new int[len1];
        System.out.println("Enter 1st array elements:");
        for(int i=0;i<len1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter 2nd array length:");
        int len2=sc.nextInt();
        int[] b=new int[len2];
        System.out.println("Enter 2nd array elements:");
        for(int i=0;i<len2;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("Union:"+findUnion(a,b));
    }
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> union=new ArrayList<>();
        int len1=a.length,len2=b.length;
        int i=0,j=0;
        while (i<len1 && j<len2){
            if(a[i]<=b[j]){
                if(union.isEmpty() || union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                }
                i++;
            }else{
                if(union.isEmpty() || union.get(union.size()-1)!=b[j]){
                    union.add(b[j]);
                }
                j++;
            }
        }
        while (i<len1){
            if(union.isEmpty() || union.get(union.size()-1)!=a[i]){
                union.add(a[i]);
            }
            i++;
        }
        while (j<len2){
            if(union.isEmpty() || union.get(union.size()-1)!=b[j]){
                union.add(b[j]);
            }
            j++;
        }
        return union;
    }
}
