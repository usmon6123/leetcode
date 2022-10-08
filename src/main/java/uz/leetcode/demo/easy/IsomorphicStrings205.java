package uz.leetcode.demo.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("ege","aed"));
        System.out.println(isIsomorphic("badc","baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        boolean[] values = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                if (map.get(s.charAt(i)) != t.charAt(i))return false;
            }else if (values[t.charAt(i)])return false;
            map.put(s.charAt(i),t.charAt(i));
            values[t.charAt(i)] = true;

        }
        return true;
    }
}
