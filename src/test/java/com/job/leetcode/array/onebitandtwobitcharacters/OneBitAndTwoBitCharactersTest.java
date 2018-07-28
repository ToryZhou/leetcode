package com.job.leetcode.array.onebitandtwobitcharacters;

import org.junit.Assert;
import org.junit.Test;

public class OneBitAndTwoBitCharactersTest {

    @Test
    public void test() {
        OneBitAndTwoBitCharacters oneBitAndTwoBitCharacters = new OneBitAndTwoBitCharacters();
        Assert.assertTrue(oneBitAndTwoBitCharacters.isOneBitCharacter(new int[]{1, 0, 0}));
        Assert.assertFalse(oneBitAndTwoBitCharacters.isOneBitCharacter(new int[]{1, 1, 1, 0}));
        Assert.assertTrue(oneBitAndTwoBitCharacters.isOneBitCharacter(new int[]{1, 1, 0}));
    }
}
