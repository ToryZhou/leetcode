package com.job.leetcode.array.singlenumber;

import java.util.ArrayList;

/**
 * https://leetcode-cn.com/problems/single-number/description/
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int n = 0;
        for (int i : nums) {
            n = n ^ i;
        }
        return n;
    }

    public int singleNumberLower(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : nums) {
            if (arrayList.contains(i)) {
                arrayList.remove(new Integer(i));
            } else {
                arrayList.add(i);
            }
        }
        return arrayList.get(0);
    }
}
