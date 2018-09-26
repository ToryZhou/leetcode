package com.job.leetcode.dynamicprogramming.triangle;

import java.util.List;

/**
 * https://leetcode-cn.com/problems/triangle/description/
 */
public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        //用dp数组来表示最优解，数组的最大长度与三角形的高度相等。
        //因为每次从三角形的每行取一个值，能够取值的数量取决于三角形的行数（高度）
        int[] dp = new int[len];
        for (int i = len - 1; i >= 0; i--) { //对每一层来说
            for (int j = 0; j <= i; j++) { //Check每个元素
                //递推表达式
                if (i == len - 1) {
                    dp[j] = triangle.get(i).get(j); //dp[j]用于表示最小路径和
                } else {
                    //找到两个最小的值，将他们相加并赋值
                    dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
                }
            }
        }
        return dp[0];
    }
}
