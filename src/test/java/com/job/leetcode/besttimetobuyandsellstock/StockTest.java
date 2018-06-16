package com.job.leetcode.besttimetobuyandsellstock;

import org.junit.Assert;
import org.junit.Test;

public class StockTest {

    @Test
    public void test(){
        Stock stock = new Stock();
        Assert.assertEquals(5,stock.maxProfit(new int[]{7,1,5,3,6,4}));
        Assert.assertEquals(0,stock.maxProfit(new int[]{7,6,4,3,1}));

        Assert.assertEquals(5,stock.maxProfitOnce(new int[]{7,1,5,3,6,4}));
        Assert.assertEquals(0,stock.maxProfitOnce(new int[]{7,6,4,3,1}));
    }
}
