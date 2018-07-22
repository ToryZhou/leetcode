package com.job.leetcode.array.findallnumbersdisappearedinanarray;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/description/
 */
public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(i + 1);
        }
        for (int num : nums) {
            result.remove(new Integer(num));
        }
        return result;
    }
}
