package com.job.leetcode.lottery;

public class Lottery {

    public double[] winDrawLossMax(double[] rate) {
        double winRate = rate[0];
        double drawRate = rate[1];
        double loseRate = rate[2];
        int money = 10;
        double maxGet = 0;
        double wholeRate = winRate + drawRate + loseRate;
        int maxWinBuy = 0;
        int maxDrawBuy = 0;
        int maxLoseBuy = 0;
        for (int winBuy = 0; winBuy <= money; winBuy++) {
            for (int drawBuy = 0; drawBuy <= money - winBuy; drawBuy++) {
                int loseBuy = money - winBuy - drawBuy;
                System.out.printf("%s, %s, %s\n", winBuy * winRate, drawBuy * drawRate, loseBuy * loseRate);
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

    public double[] winDrawLossMin(double[] rate) {
        double winRate = rate[0];
        double drawRate = rate[1];
        double loseRate = rate[2];
        int money = 100;
        double minGet = 100;
        double wholeRate = winRate + drawRate + loseRate;
        int minWinBuy = 0;
        int minDrawBuy = 0;
        int minLoseBuy = 0;
        for (int winBuy = 0; winBuy <= money; winBuy++) {
            for (int drawBuy = 0; drawBuy <= money - winBuy; drawBuy++) {
                int loseBuy = money - winBuy - drawBuy;
                double get = winBuy * (winRate / wholeRate) + drawBuy * (drawRate / wholeRate) + loseBuy * (loseRate / wholeRate);
                if (get < minGet) {
                    minWinBuy = winBuy;
                    minDrawBuy = drawBuy;
                    minLoseBuy = loseBuy;
                    minGet = get;
                    System.out.printf("%s, %s,%s, %s\n", minWinBuy, minDrawBuy, minLoseBuy, minGet);
                }
            }
        }
        return new double[]{minWinBuy, minDrawBuy, minLoseBuy, minGet};
    }

    public double[] winDrawMax(double[] rate) {
        double winRate = rate[0];
        double drawRate = rate[1];
        int money = 100;
        double maxGet = 0;
        double wholeRate = winRate + drawRate;
        int maxWinBuy = 0;
        int maxDrawBuy = 0;
        for (int winBuy = 0; winBuy <= money; winBuy++) {
            int drawBuy = money - winBuy;
            double get = winBuy * (winRate / wholeRate) + drawBuy * (drawRate / wholeRate);
            System.out.printf("%s, %s,%s\n", winBuy, drawBuy, get);
            if (get > maxGet) {
                maxWinBuy = winBuy;
                maxDrawBuy = drawBuy;
                maxGet = get;
//                System.out.printf("%s, %s,%s\n", maxWinBuy, maxDrawBuy, maxGet);
            }
        }
        return new double[]{maxWinBuy, maxDrawBuy, maxGet};
    }

    public double[] winDrawMaxToAverage(double[] rate) {
        double winRate = rate[0];
        double drawRate = rate[1];
        int money = 100;
        double maxGet = 0;
        int maxWinBuy = 0;
        int maxDrawBuy = 0;
        for (int winBuy = 0; winBuy <= money; winBuy++) {
            int drawBuy = money - winBuy;
            double getWin = winBuy * winRate;
            double getLose = drawBuy * drawRate;
            System.out.printf("winBuy=%s, drawBy=%s, %s, %s\n", winBuy, drawBuy, getWin, getLose);
        }
        return new double[]{maxWinBuy, maxDrawBuy, maxGet};
    }
}
