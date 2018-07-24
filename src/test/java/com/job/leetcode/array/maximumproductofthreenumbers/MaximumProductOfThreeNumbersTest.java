package com.job.leetcode.array.maximumproductofthreenumbers;

import org.junit.Assert;
import org.junit.Test;

public class MaximumProductOfThreeNumbersTest {

    @Test
    public void test() {
        MaximumProductOfThreeNumbers maximumProductOfThreeNumbers = new MaximumProductOfThreeNumbers();
        Assert.assertEquals(6, maximumProductOfThreeNumbers.maximumProduct(new int[]{1, 2, 3}));
        Assert.assertEquals(24, maximumProductOfThreeNumbers.maximumProduct(new int[]{1, 2, 3, 4}));


        Assert.assertEquals(180, maximumProductOfThreeNumbers.maximumProduct(new int[]{6,2,6,5,1,2}));

    }
}
