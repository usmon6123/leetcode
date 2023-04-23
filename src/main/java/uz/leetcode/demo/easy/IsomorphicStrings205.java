package uz.leetcode.demo.easy;

import java.util.*;
import java.util.stream.Collectors;

public class IsomorphicStrings205 {
    public static void main(String[] args) {
        System.out.println(getMax("1 3 222 1 754 123 12 -888888888 999999999 34254 23"));
    }

    public static int getMax(String str) {
        List<Integer> integerList = Arrays.stream(str.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int max = 0;
        for (Integer integer : integerList) {
            max = integer > max ? integer : max;
        }
        return max;
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        boolean[] values = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) return false;
            } else if (values[t.charAt(i)]) return false;
            map.put(s.charAt(i), t.charAt(i));
            values[t.charAt(i)] = true;

        }
        return true;
    }
}
