package com.job.leetcode.array.searchinsertposition;

/**
 * Auther: toryzhou
 * Date: 7/9/18 01:47
 * https://leetcode-cn.com/problems/search-insert-position/description/
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }

}
