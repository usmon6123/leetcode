package uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P151ReverseWordsInAString {
    public static String reverseWords(String s) {
        List<String> collect = Arrays.stream(s.split(" ")).filter(s1 -> s1.length() > 0).collect(Collectors.toList());
        StringBuilder res = new StringBuilder();
        for (int i = collect.size() - 1; i >= 0; i--) {
            res.append(collect.get(i));
            if (i != 0) res.append(" ");
        }
        return String.valueOf(res);
    }
}
