package com.job.leetcode.array.mergesortedarray;

import org.junit.Test;

public class MergeSortedArrayTest {

    @Test
    public void test() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] numTest1 = new int[]{1,2,3,0,0,0};
        mergeSortedArray.merge(numTest1,3,new int[]{2,5,6},3);
        System.out.println();

        int[] numTest2 = new int[]{2,0};
        mergeSortedArray.merge(numTest2,1,new int[]{1},1);
        System.out.println();


        int[] numTest3 = new int[]{4, 5, 6, 0, 0, 0};
        mergeSortedArray.merge(numTest3, 3, new int[]{1, 2, 3}, 3);
        System.out.println();

        int[] numTest4 = new int[]{4, 0, 0, 0, 0, 0};
        mergeSortedArray.merge(numTest4, 1, new int[]{1, 2, 3, 5, 6}, 5);
        System.out.println();
    }
}
