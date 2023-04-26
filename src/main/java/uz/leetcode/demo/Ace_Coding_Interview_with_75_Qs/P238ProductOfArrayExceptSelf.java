package uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs;

public class P238ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int left = 1;
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = left * nums[i - 1];
            left *= res[i];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * right;
            right *= nums[i];
        }
        return res;
    }
}
