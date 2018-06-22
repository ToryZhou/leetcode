package com.job.leetcode.peakindexinamountainarray;

public class PeakIndexInAMountainArray {

    public int peakIndexInMountainArray(int[] A) {
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A[index]) {
                index = i;
            }
        }
        return index;
    }

}
