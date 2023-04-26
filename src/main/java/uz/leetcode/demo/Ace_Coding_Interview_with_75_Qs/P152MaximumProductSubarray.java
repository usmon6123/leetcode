package uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs;

public class P152MaximumProductSubarray {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2,-5,-2,-4,3}));
    }

    //todo mukammal to'g'ri emas
    public static int maxProduct(int[] nums) {
        if(nums.length == 1)return nums[0];
        int max = -11, sum = 1, total = 1;
        for(int i=0; i<nums.length; i++){
            total *= nums[i];
            if(total == 0)total = 1;

            sum *= nums[i];
            if(sum > max) max = sum;
            else {
                sum = nums[i];
                if(sum > max) max = sum;
            }
        }
        if(sum > max) max = sum;
        if(total > max && total != 1) max = total;
        return max;
    }
}
