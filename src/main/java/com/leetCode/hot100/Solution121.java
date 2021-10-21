package com.leetCode.hot100;

public class Solution121 {
    public static void main(String[] args) {
        Solution121 s = new Solution121();
    }

    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 2; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[0][0] - prices[i]);
        }
        return dp[prices.length - 1][0];
    }
}
