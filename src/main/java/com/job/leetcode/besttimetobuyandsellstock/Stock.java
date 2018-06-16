package com.job.leetcode.besttimetobuyandsellstock;

/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 */
public class Stock {

    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            int max = rightBiggest(prices, i);
            if (max > prices[i]) {
                if (max - prices[i] > result) {
                    result = max - prices[i];
                }
            }
        }
        return result;
    }

    private int rightBiggest(int[] prices, int index) {
        int max = 0;
        for (; index < prices.length; index++) {
            if (prices[index] > max) {
                max = prices[index];
            }
        }
        return max;
    }

}
