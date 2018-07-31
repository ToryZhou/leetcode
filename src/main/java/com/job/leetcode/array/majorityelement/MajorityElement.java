package com.job.leetcode.array.majorityelement;

import java.util.HashMap;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/majority-element/description/
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer integer = map.get(num);
            integer = null == integer ? 0 : integer;
            map.put(num, integer + 1);
        }
        Set<Integer> integers = map.keySet();
        for (Integer key : integers) {
            if (map.get(key) > nums.length / 2) {
                return key;
            }
        }
        return 0;
    }
}
