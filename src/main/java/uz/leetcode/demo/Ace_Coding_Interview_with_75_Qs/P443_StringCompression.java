package uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class P443_StringCompression {
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a'}));
    }

    public static int compress(char[] chars) {
        char x = chars[0];
        int count = 0, i = 0, t = 0;
        for (char c : chars) {
            if (c == x) count++;
            else {
                t++;
                chars[i++] = x;
                x = c;
                if (count > 1) {
                    for (char c1 : String.valueOf(count).toCharArray()) {
                        chars[i++] = c1;
                        t++;
                    }
                }
                count = 1;
            }
        }
        if (count == 1) {
            chars[i++] = x;
            t++;
        }
        else if (count > 1) {
            t++;
            chars[i++] = x;
            for (char c1 : String.valueOf(count).toCharArray()) {
                chars[i++] = c1;
                t++;
            }

        }
        System.out.println(Arrays.toString(chars));
        return t;
    }

    private static void addCount(StringBuilder str, int count) {
        while (count > 0) {
            str.append(count % 10);
            count /= 10;
        }
    }
}
