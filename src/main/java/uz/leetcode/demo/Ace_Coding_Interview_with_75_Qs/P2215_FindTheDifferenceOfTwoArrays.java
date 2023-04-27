package uz.leetcode.demo.Ace_Coding_Interview_with_75_Qs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P2215_FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            set2.add(nums2[i]);
        }
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        for (Integer integer : set1) {
            if (!set2.contains(integer))res1.add(integer);
        }
        for (Integer integer : set2) {
            if (!set1.contains(integer))res2.add(integer);
        }
        ArrayList<List<Integer>> res = new ArrayList<>();
        res.add(res1);
        res.add(res2);
        return res;
    }
}
