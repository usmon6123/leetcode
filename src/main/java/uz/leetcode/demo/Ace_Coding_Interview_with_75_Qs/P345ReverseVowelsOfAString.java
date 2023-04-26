package uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs;

import java.util.ArrayList;
import java.util.List;

public class P345ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !isVowel(c[left])) left++;
            while (left < right && !isVowel(c[right])) right--;
            if (left < right){
                char helper = c[left];
                c[left] = c[right];
                c[right] = helper;
                left++;
                right--;
            }
        }
        return String.valueOf(c);

    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
