package uz.leetcode.demo;

import java.util.ArrayList;
import java.util.List;

public class Hackerrank {
    public static void main(String[] args) {
    List<Integer> as = new ArrayList<>();
    as.add(-4);
    as.add(3);
    as.add(-9);
    as.add(0);
    as.add(4);
    as.add(1);
        plusMinus(as);

    }
    public static void plusMinus(List<Integer> arr) {
        int plus = 0, minus = 0, zero = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > 0)plus++;
            else if(arr.get(i) < 0)minus++;
            else zero++;
        }
        System.out.printf("%.6f",(double)plus/arr.size());
        System.out.println();
        System.out.printf("%.6f",(double)minus/arr.size());
        System.out.println();
        System.out.printf("%.6f",(double)zero/arr.size());

    }


    public static int diagonalDifference(List<List<Integer>> arr) {
        int l = 0, r = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (j == i) l += arr.get(i).get(j);
                if (j + i == arr.size() - 1) r += arr.get(i).get(j);
            }
        }
        System.out.println("%.2f \r");
        return Math.abs(l - r);
    }
}
