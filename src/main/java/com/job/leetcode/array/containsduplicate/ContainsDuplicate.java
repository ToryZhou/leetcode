package com.job.leetcode.array.containsduplicate;

import java.util.HashSet;

/**
 * https://leetcode-cn.com/problems/contains-duplicate/description/
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i : nums) {
            integers.add(i);
        }
        return integers.size() < nums.length;
    }
}
