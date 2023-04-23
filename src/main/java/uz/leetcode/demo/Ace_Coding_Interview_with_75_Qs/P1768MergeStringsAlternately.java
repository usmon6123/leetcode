package uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs;

public class P1768MergeStringsAlternately {



    public String mergeAlternately(String word1, String word2) {
        int len = Math.min(word1.length(), word2.length());
        char[] s1 = word1.toCharArray();
        char[] s2 = word2.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < len; i++){
            str
                    .append(s1[i])
                    .append(s2[i]);
        }
        str
                .append(word1.substring(len))
                .append(word2.substring(len));
        return String.valueOf(str);
    }
}
