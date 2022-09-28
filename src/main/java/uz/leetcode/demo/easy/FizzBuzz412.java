package uz.leetcode.demo.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FizzBuzz412 {

    public List<String> fizzBuzz(int n) {
        List<String>res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%3 != 0 && i%5 != 0)res.add(String.valueOf(i));
            else if (i%3 == 0 && i%5 != 0)res.add("Fizz");
            else if (i%3 != 0 && i%5 == 0)res.add("Buzz");
            else res.add("FizzBuzz");
        }return res;
    }
}
