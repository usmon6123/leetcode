package uz.leetcode.demo.easy;

public class RansomNote383 {
    public static void main(String[] args) {

        System.out.println(canConstruct("assw","ggagssaggssa"));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int arr[] = new int[26];

        for (int i:magazine.toCharArray()){
            arr[i-'a']++;
        }

        for(int i:ransomNote.toCharArray()){
         if (arr[i-'a']==0)return false;
         else arr[i-'a']--;
        }
        return true;
    }
}
