package uz.leetcode.demo.easy;

import java.util.Arrays;

public class PivotIndex724 {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{-1,-1,0,1,1,0}));
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(pivotIndex(new int[]{2,1,-1}));
        System.out.println(pivotIndex(new int[]{1,2,3}));
    }

    //birinchi yechim juda kop vatda javobga erishdi
//    public static int pivotIndex(int[] nums) {
//
//        int sum = Arrays.stream(nums).sum();
//        if(sum-nums[0]==0)return 0;
//        else if (sum-nums[nums.length-1]==0)return nums.length-1;
//
//        for (int i = 1; i < nums.length - 1; i++) {
//            if (helper(i,nums))return i;
//        }
//        return -1;
//    }
//
//    public static boolean helper(int index, int[] nums) {
//        int sum1 = 0, sum2 = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (i < index) sum1 += nums[i];
//            else if (i > index) sum2 += nums[i];
//        }
//        return sum1 == sum2;
//    }
    public static int pivotIndex(int[] nums){
        int left=0,sum=0;
        sum = Arrays.stream(nums).sum();
        for (int i=0; i<nums.length; i++){
            if (sum-nums[i]==2*left)return i;
            left+=nums[i];
        }return -1;
    }

}
