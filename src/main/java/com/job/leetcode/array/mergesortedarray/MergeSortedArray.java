package com.job.leetcode.array.mergesortedarray;

/**
 * https://leetcode-cn.com/problems/merge-sorted-array/description/
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            boolean insert = false;
            for (int j = 0; j < m + i; j++) {
                if (nums2[i] < nums1[j]) {
                    int k = m + i;
                    for (; k > j; k--) {
                        nums1[k] = nums1[k - 1];
                    }
                    nums1[k] = nums2[i];
                    insert = true;
                    break;
                }
            }
            if (!insert) {
                nums1[m + i] = nums2[i];
            }
        }
    }
}
