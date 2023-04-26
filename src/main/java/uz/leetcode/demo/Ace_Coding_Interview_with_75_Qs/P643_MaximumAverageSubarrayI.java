package uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs;

public class P643_MaximumAverageSubarrayI {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{0,4,0,3,2}, 1));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        int helper = sum;
        for(int i = k; i < nums.length; i++){
            helper +=  nums[i] - nums[i - k];
            if(sum < helper) sum = helper;
        }
        return (double)sum/k;
    }
}
