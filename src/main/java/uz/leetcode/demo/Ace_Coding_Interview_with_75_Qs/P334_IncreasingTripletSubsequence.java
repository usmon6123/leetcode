package uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs;

public class P334_IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE, middle = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] < small) small = nums[i];
            else if (nums[i] < middle) middle = nums[i];
            else return true;
        }
        return false;
    }
}
