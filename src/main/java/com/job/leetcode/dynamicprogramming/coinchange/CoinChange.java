package com.job.leetcode.dynamicprogramming.coinchange;

/**
 * https://leetcode-cn.com/problems/coin-change/description/
 */
public class CoinChange {


    //todo
    public int coinChange(int[] coins, int amount) {
        for (int i = 0; i < coins.length - 1; i++) {
            for (int j = i + 1; j < coins.length; j++) {
                if (coins[j] < coins[i]) {
                    coins[j] = coins[i] + coins[j];
                    coins[i] = coins[j] - coins[i];
                    coins[j] = coins[j] - coins[i];
                }
            }
        }
        return coinChangeCalc(coins, amount);
    }

    private int coinChangeCalc(int[] coins, int amount) {
        int length = coins.length;
        int count = 0;
        int i = length - 1;
        for (; i >= 0; i--) {
            count += amount / coins[i];
            amount = amount % coins[i];
            if (0 == amount) {
                break;
            }
        }
        if (-1 == i && amount != 0) {
            if (coins.length == 1) {
                return -1;
            }
            int[] ints = new int[coins.length - 1];
            System.arraycopy(coins, 0, ints, 0, ints.length);
            count = coinChangeCalc(ints, amount);
        }
        return count;
    }
}
