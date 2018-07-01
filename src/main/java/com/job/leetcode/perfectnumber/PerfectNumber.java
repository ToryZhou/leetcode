package com.job.leetcode.perfectnumber;

/**
 * https://leetcode-cn.com/problems/perfect-number/description/
 */
public class PerfectNumber {

    public boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        int i = 1;
        for (; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }
        if ((i - 1) * (i - 1) == num) {
            sum = sum - (i - 1);
        }
        return sum - num == num;
    }


    public boolean checkPerfectNumberLower(int num) {
        if (num == 0) {
            return false;
        }
        int sum = 0;
        int temp = num / 2;
        for (int i = 1; i < temp; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
                if (num / i <= temp) {
                    temp = num / i;
                }
            }
        }
        return sum == num * 2;
    }
}
