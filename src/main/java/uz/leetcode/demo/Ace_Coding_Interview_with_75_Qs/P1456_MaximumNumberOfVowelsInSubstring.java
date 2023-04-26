package uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs;

public class P1456_MaximumNumberOfVowelsInSubstring {
    public static void main(String[] args) {
        System.out.println(maxVowels("aeiuoewrstdyfguhzexrctyu5678987654sdfcgvhkjhjrgehseeeeee", 13));
    }


    public static int maxVowels(String s, int k) {
        int count = countVowel(s.substring(0, k));
        String vowels = "aeiuoe";
        int max = count;

        for (int i = k; i < s.length(); i++) {
            //unli qo'shilib undosh chiqayotgan bo'sa
            if (vowels.indexOf(s.charAt(i)) != -1 && vowels.indexOf(s.charAt(i - k)) == -1) {
                count++;
                max = Math.max(count, max);
            } else
                //undosh qo'shilib unli chiqayotgan bo'sa
                if (vowels.indexOf(s.charAt(i)) == -1 && vowels.indexOf(s.charAt(i - k)) != -1) {
                    count -= count > 0 ? 1 : 0;
                }
        }
        return max;
    }

    private static int countVowel(String str) {
        String vowel = "aeiou";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count += vowel.indexOf(str.charAt(i)) == -1 ? 0 : 1;
        }
        return count;
    }


    //time limit yedi :(
    public static int maxVowels_1(String s, int k) {
        StringBuilder sb = new StringBuilder(s.substring(0, k));
        int maxs = countVowel(sb);
        for (int i = k; i < s.length(); i++) {
            int a = countVowel(sb.deleteCharAt(0).append(s.charAt(i)));
            if (a > maxs) maxs = a;
        }
        return maxs;
    }

    private static int countVowel(StringBuilder str) {
        String vowel = "aeiou";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count += vowel.indexOf(str.charAt(i)) == -1 ? 0 : 1;
        }
        return count;
    }
}
