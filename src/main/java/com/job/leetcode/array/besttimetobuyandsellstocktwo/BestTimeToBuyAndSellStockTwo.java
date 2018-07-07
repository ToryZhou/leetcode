package com.job.leetcode.array.besttimetobuyandsellstocktwo;

/**
 * Auther: toryzhou
 * Date: 7/6/18 19:55
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 */
public class BestTimeToBuyAndSellStockTwo {

    public int maxProfit(int[] prices) {
        int buyPrice = 0;
        int earn = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i] && buyPrice == 0) {
                buyPrice = prices[i];
            }
            if (prices[i + 1] < prices[i] && buyPrice != 0) {
                earn += prices[i] - buyPrice;
                buyPrice = 0;
            }
        }
        if (buyPrice != 0) {
            earn += prices[prices.length - 1] - buyPrice;
        }
        return earn;
    }
}
