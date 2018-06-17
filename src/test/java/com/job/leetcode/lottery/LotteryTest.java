package com.job.leetcode.lottery;

import org.junit.Test;

public class LotteryTest {

    @Test
    public void test() {
        System.out.println("每场买入总额100元加权最优买入");
        double[] costaVsSerbiaRate = {4.16, 3.18, 1.74};
        double[] costaPlusOneVsSerbiaRate = {1.85, 3.28, 3.55};
        double[] germanyVsMexicoRate = {1.26, 4.60, 8.45};
        double[] germanyMinusOneVsMexicoRate = {2.00, 3.40, 2.98};
        double[] brazilVsMexicoRate = {1.26, 4.40, 9.20};
        double[] brazilMinusOneVsMexicoRate = {1.90, 3.45, 3.19};
        printResult(costaVsSerbiaRate, "哥斯达(主) VS 塞尔维亚(客)");
        printResult(costaPlusOneVsSerbiaRate, "哥斯达(让球 主+1) VS 塞尔维亚(客)");
        printResult(germanyVsMexicoRate, "德国(主) VS 墨西哥(客)");
        printResult(germanyMinusOneVsMexicoRate, "德国(让球 主-1) VS 墨西哥(客)");
        printResult(brazilVsMexicoRate, "巴西(主) VS 瑞士(客)");
        printResult(brazilMinusOneVsMexicoRate, "巴西(让球 主-1) VS 瑞士(客)");
    }

    private void printResult(double[] rate, String title) {
        Lottery lottery = new Lottery();
        double[] result = lottery.winDrawLossMin(rate);
        System.out.printf("%s, 赔率:%s(主胜),%s(平),%s(客胜)\n", title, rate[0], rate[1], rate[2]);
        System.out.printf("主胜买入%s, 平买入%s, 客胜买入%s, 加权收回总额  %s\n\n", result[0], result[1], result[2], result[3]);
    }

    @Test
    public void testTwo(){
        Lottery lottery = new Lottery();

//        double[] germanyVsMexicoRate = {1.26, 4.62};
//        lottery.winDrawMax(germanyVsMexicoRate);

//        double[] brazilVsMexicoRate = {1.26, 4.40, 9.20};
//        lottery.winDrawMax(brazilVsMexicoRate);

        double[] d = {1.26, 8.45};
        lottery.winDrawMax(d);
    }
}
