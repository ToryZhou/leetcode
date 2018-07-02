package com.job.leetcode.dynamicprogramming.coinchange;

/**
 * https://leetcode-cn.com/problems/coin-change/description/
 */
public class CoinChange {
    private static int maxValue = 100000000;

    private int search(int index, int amount, int[] coins) {
        if (index >= coins.length) {
            return maxValue;
        }
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return maxValue;
        }
        return Math.min(search(index, amount - coins[index], coins) + 1,
                search(index + 1, amount, coins));
    }

    public int coinChange(int[] coins, int amount) {
        int val = search(0, amount, coins);
        return val < maxValue ? val : -1;
    }

    public int coinChangeError(int[] coins, int amount) {
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
