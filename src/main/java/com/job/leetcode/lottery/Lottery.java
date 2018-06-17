package com.job.leetcode.lottery;

public class Lottery {

    public double[] winDrawLoss(double[] rate) {
        double winRate = rate[0];
        double drawRate = rate[1];
        double loseRate = rate[2];
        int money = 100;
        double maxGet = 0;
        double wholeRate = winRate + drawRate + loseRate;
        int maxWinBuy = 0;
        int maxDrawBuy = 0;
        int maxLoseBuy = 0;
        for (int winBuy = 0; winBuy <= money; winBuy++) {
            for (int drawBuy = 0; drawBuy <= money - winBuy; drawBuy++) {
                int loseBuy = money - winBuy - drawBuy;
                double get = winBuy * (winRate / wholeRate) + drawBuy * (drawRate / wholeRate) + loseBuy * (loseRate / wholeRate);
                if (get > maxGet) {
                    maxWinBuy = winBuy;
                    maxDrawBuy = drawBuy;
                    maxLoseBuy = loseBuy;
                    maxGet = get;
                }
            }
        }
        return new double[]{maxWinBuy, maxDrawBuy, maxLoseBuy, maxGet};
    }
}
