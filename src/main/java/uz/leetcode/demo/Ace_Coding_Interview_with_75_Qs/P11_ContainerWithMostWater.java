package uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs;

public class P11_ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,2,4,3}));
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxArea(new int[]{1, 1}));
    }

    //TODO Time Limit Exceeded
    public static int maxArea_1(int[] height) {
        int l = 0, r = height.length - 1, sum = 0;
        while (r > l) {
            for (int i = r; i >= l; i--) {
                sum = Math.max(Math.min(height[l], height[i]) * (i - l), sum);
            }
            l++;
            for (int i = l; i <= r; i++) {
                sum = Math.max(Math.min(height[r], height[i]) * (r - i), sum);
            }
            r--;
        }
        return sum;
    }
    public static int maxArea(int[] height) {
        int l=0,r=height.length-1,sum=0;
        while (r>l){
            sum = Math.max(Math.min(height[l],height[r]) * (r-l),sum);
            if(height[l]>height[r])r--;
            else l++;
        }
        return sum;
    }
}
