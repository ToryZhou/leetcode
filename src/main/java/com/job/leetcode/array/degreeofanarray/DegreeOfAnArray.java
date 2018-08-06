package com.job.leetcode.array.degreeofanarray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/degree-of-an-array/description/
 */
public class DegreeOfAnArray {


    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer integer = map.get(nums[i]) == null ? 0 : map.get(nums[i]);
            map.put(nums[i], integer + 1);
        }
        Set<Integer> integers = map.keySet();
        Integer degree = 0;
        for (Integer key : integers) {
            if (map.get(key) > degree) {
                degree = map.get(key);
            }
        }
        HashSet<Integer> maxSet = new HashSet<>();
        for (Integer key : integers) {
            if (map.get(key).equals(degree)) {
                maxSet.add(key);
            }
        }
        int result = nums.length;
        for (Integer key : maxSet) {
            int begin = 0;
            int end = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == key) {
                    begin = i;
                    break;
                }
            }
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == key) {
                    end = i;
                    break;
                }
            }
            if (end - begin + 1 < result) {
                result = end - begin + 1;
            }
        }
        return result;
    }

}
