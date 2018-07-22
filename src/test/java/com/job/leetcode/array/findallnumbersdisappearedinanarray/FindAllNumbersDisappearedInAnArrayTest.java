package com.job.leetcode.array.findallnumbersdisappearedinanarray;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArrayTest {

    @Test
    public void test() {
        FindAllNumbersDisappearedInAnArray findAllNumbersDisappearedInAnArray = new FindAllNumbersDisappearedInAnArray();
        List<Integer> disappearedNumbers = findAllNumbersDisappearedInAnArray.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        Assert.assertEquals(Arrays.asList(5,6),disappearedNumbers);

    }
}
