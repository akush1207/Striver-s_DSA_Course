package Array;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of intervals:");
        int n=sc.nextInt();
        int[][] intervals=new int[n][2];
        System.out.print("Enter the intervals:");
        for(int i=0;i<n;i++){
            intervals[i][0]=sc.nextInt();
            intervals[i][1]=sc.nextInt();
        }
        System.out.println("Merge Intervals:"+Arrays.deepToString(mergeIntervals(intervals)));
    }
    public static int[][] mergeIntervals(int[][] intervals){
        if(intervals.length==1){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<List<Integer>> temp=new ArrayList<>();
        for (int[] interval : intervals) {
            if (temp.isEmpty() || interval[0] > temp.get(temp.size() - 1).get(1)) {
                temp.add(Arrays.asList(interval[0], interval[1]));
            } else {
                temp.get(temp.size() - 1).set(1, Math.max(temp.get(temp.size() - 1).get(1), interval[1]));
            }
        }
        int[][] ans=new int[temp.size()][2];
        for(int i=0;i<temp.size();i++){
            ans[i][0]=temp.get(i).get(0);
            ans[i][1]=temp.get(i).get(1);
        }
        return ans;
    }
}
