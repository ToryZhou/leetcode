package com.job.leetcode.perfectnumber;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/perfect-number/description/
 */
public class PerfectNumber {

    // todo
    public boolean checkPerfectNumber(int num) {
        if (num == 0) {
            return false;
        }
        int sum = 0;
        List<Integer> integers = new ArrayList<>();
        int temp = num / 2;
        for (int i = 1; i < temp; i++) {
            if (num % i == 0) {
                integers.add(i);
                integers.add(num / i);
                if (num / i <= temp) {
                    temp = num / i;
                }
            }
        }
        for (int i : integers) {
            sum += i;
        }
        return sum == num * 2;
    }
}
