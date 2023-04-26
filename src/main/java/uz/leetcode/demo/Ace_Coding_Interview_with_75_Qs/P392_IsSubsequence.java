package uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs;

public class P392_IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        for (int i = 0,k=0; i < t.length(); i++) {
            if(s.charAt(k) == t.charAt(i)){
                if (k == s.length()-1) return true;
                k++;
            }
        }
        return false;
    }
}
