package uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs;

import java.util.HashMap;

public class P1207_UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashMap hashMap = new HashMap<Integer,Integer>();

        for (Integer value : map.values()) {
            hashMap.put(value,map.getOrDefault(value,0)+1);
        }

        return hashMap.size()==map.size();
    }
}
