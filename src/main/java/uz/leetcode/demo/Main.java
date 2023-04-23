package uz.leetcode.demo;

import uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs.P1768MergeStringsAlternately;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        P1768MergeStringsAlternately p = new P1768MergeStringsAlternately();

        System.out.println(p.mergeAlternately("abcd","efghijkl"));

    }
    public static int findGCD(int[] nums) {
        int min = nums[0],max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max) max = nums[i];
            if(nums[i] < min) min = nums[i];
        }
        return ekub(max,min);
    }

    private static int ekub(int a, int b) {
        if(b == 0)return a;
        else return ekub(b,a % b);
    }

    public static void duplicateZeros(int[] arr) {
        int c = 0, l = arr.length;
        for (int n : arr) {
            if (n == 0) c++;
        }
        int res[] = new int[l + c];
        for (int i = 0, j = 0; i < l; i++, j++) {
            if (arr[i] != 0) res[j] = arr[i];
            else {
                res[j] = 0;
                j++;
            }
        }

        for (int i = 0; i < res.length; i++) {
            arr[i] = res[i];
        }
    }

    public static int numEnclaves(int[][] grid) {
        int len = grid.length;

        for (int i = 0; i < len; i++) {
            if (grid[0][i] == 1) checkCell(grid, 0, i);
            if (grid[len - 1][i] == 1) checkCell(grid, len - 1, i);
            if (grid[i][0] == 1) checkCell(grid, i, 0);
            if (grid[i][len - 1] == 1) checkCell(grid, i, len - 1);
        }
        int res = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (grid[i][j] == 1) res++;
            }
        }
        return res;
    }

    private static void checkCell(int[][] grid, int i, int j) {
        int len = grid.length;

        if (i < 0 || i >= len || j < 0 || j >= len || grid[i][j] != 1) return;

        grid[i][j] = -1;

        checkCell(grid, i + 1, j);
        checkCell(grid, i - 1, j);
        checkCell(grid, i, j + 1);
        checkCell(grid, i, j - 1);

    }

    public int[] leftRigthDifference(int[] nums) {
        int sum = Arrays.stream(nums).sum(), l = nums.length;
        int[] res = new int[l];
        int[] leftSum = new int[l];
        int[] rightSum = new int[l];
        int left = 0, right = 0;
        for (int i = 0; i < l; i++) {
            leftSum[i] = left;
            left += nums[i];

            rightSum[l - 1 - i] = right;
            right += nums[l - 1 - i];
        }
        for (int i = l - 1; i >= 0; i++) {
            res[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return res;
    }

    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        char[] chars = s.toCharArray();
        try {

            for (char aChar : chars) {
                if (aChar == '(' || aChar == '{' || aChar == '[') stk.push(aChar);
                else if (aChar == ')' && stk.peek() == '(') stk.pop();
                else if (aChar == '}' && stk.peek() == '{') stk.pop();
                else if (aChar == ']' && stk.peek() == '[') stk.pop();
            }
            return stk.size() == 0;
        } catch (Exception e) {
            return false;
        }
    }

    public int maxDepth(String s) {
        ArrayList<Integer> list = new ArrayList<>();

        int max = 0, count = 0;
        char[] chars = s.toCharArray();
        for (char n : chars) {
            if (n == '(') {
                if (count >= max) max++;
                count++;
            } else if (n == ')') {
                count--;
            }
        }
        return max;
    }

}