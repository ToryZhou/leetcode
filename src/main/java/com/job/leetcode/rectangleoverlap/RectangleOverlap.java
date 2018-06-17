package com.job.leetcode.rectangleoverlap;

/**
 * https://leetcode-cn.com/problems/rectangle-overlap/description/
 */
public class RectangleOverlap {

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return isIn(rec1, rec2) || isIn(rec2, rec1);
    }

    private boolean isIn(int[] rec1, int[] rec2) {
        boolean xIn = false;
        boolean yIn = false;
        if (rec2[0] < rec1[2] && rec2[2] > rec1[0]) {
            xIn = true;
        }
        if (rec2[1] < rec1[3] && rec2[3] > rec1[1]) {
            yIn = true;
        }
        return xIn && yIn;
    }
}
