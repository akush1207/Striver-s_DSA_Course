package String;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortCharactersByFrequency {
    static class Pair implements Comparable<Pair>{
        char ch;
        int freq;
        Pair(char ch,int freq){
            this.ch=ch;
            this.freq=freq;
        }
        @Override
        public int compareTo(Pair other) {
            return Integer.compare(other.freq, this.freq);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=sc.next();
        System.out.println("Frequency sort:"+frequencySortBrute(s));
        System.out.println("Frequency sort:"+frequencySortOptimum(s));
    }
    public static String frequencySortBrute(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }
        StringBuilder ans= new StringBuilder();
        while (!pq.isEmpty()){
            Pair pair=pq.poll();
            ans.append(String.valueOf(pair.ch).repeat(Math.max(0, pair.freq)));
        }
        return ans.toString();
    }
    public static String frequencySortOptimum(String s){
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(freqMap.entrySet());
        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char ch = entry.getKey();
            int freq = entry.getValue();
            result.append(String.valueOf(ch).repeat(Math.max(0, freq)));
        }
        return result.toString();
    }
}
