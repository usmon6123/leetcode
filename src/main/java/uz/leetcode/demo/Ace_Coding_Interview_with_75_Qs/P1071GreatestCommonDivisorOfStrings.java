package uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs;

public class P1071GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        //EKUB UZUNLIKNI TOPYAPMAN MASALA SHARTI BO'YICHA EKUB UZUNLIKDAGI QIYMAT QAYTARILADI YOKI "";
        int x = EKUB(len1, len2);


        String str = str1.substring(0, x);

        if (changeStr(str2, str) && changeStr(str1, str))
            return str;
        else return "";

    }

    private boolean changeStr(String str2, String str) {
        int len = str.length();
        for (int i = 0; i < str2.length(); i += len) {
            if (!str2.substring(i, i + len).equals(str)) return false;
        }
        return true;
    }

    private int EKUB(int a, int b) {
        if (b == 0) return a;
        else return EKUB(b, a % b);
    }

}
