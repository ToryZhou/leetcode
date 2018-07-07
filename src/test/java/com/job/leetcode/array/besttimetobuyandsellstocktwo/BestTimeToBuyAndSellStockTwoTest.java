package com.job.leetcode.array.besttimetobuyandsellstocktwo;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTwoTest {

    @Test
    public void test() {
        BestTimeToBuyAndSellStockTwo bestTimeToBuyAndSellStockTwo = new BestTimeToBuyAndSellStockTwo();
        Assert.assertEquals(7, bestTimeToBuyAndSellStockTwo.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(4, bestTimeToBuyAndSellStockTwo.maxProfit(new int[]{1, 2, 3, 4, 5}));
        Assert.assertEquals(0, bestTimeToBuyAndSellStockTwo.maxProfit(new int[]{7, 6, 4, 3, 1}));
        Assert.assertEquals(2, bestTimeToBuyAndSellStockTwo.maxProfit(new int[]{2, 1, 2, 0, 1}));
    }
}
