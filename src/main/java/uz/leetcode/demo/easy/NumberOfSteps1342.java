package uz.leetcode.demo.easy;

public class NumberOfSteps1342 {
    public int numberOfSteps(int num) {
        int res = 0;
        while (num>0){
            num /= 2;
            if (num % 2 !=0)
                res++;
            res++;
        }
        return res;
    }
}
