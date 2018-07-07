package com.job.leetcode.array.besttimetobuyandsellstocktwo;

/**
 * Auther: toryzhou
 * Date: 7/6/18 19:55
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 */
public class BestTimeToBuyAndSellStockTwo {

    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length - 1; ++i) {
            if (prices[i] < prices[i + 1]) {
                res += prices[i + 1] - prices[i];
            }
        }
        return res;
    }

    public int maxProfitLower(int[] prices) {
        int buyPrice = -1;
        int earn = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i] && buyPrice == -1) {
                buyPrice = prices[i];
            }
            if (prices[i + 1] < prices[i] && buyPrice != -1) {
                earn += prices[i] - buyPrice;
                buyPrice = -1;
            }
        }
        if (buyPrice != -1) {
            earn += prices[prices.length - 1] - buyPrice;
        }
        return earn;
    }
}
