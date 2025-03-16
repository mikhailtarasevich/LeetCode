package com.mt.leetcode;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < min) min = prices[i];
            if(maxProfit < (prices[i] - min)) maxProfit = prices[i] - min;
        }

        return maxProfit;
    }

}
