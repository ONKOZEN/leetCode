package com.leetCode.hot100;

public class Solution70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(12));

    }
    public static int climbStairs(int n) {
        if(n<0){
            return 0;
        }else {
            int[] dp = new int[n+1];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i < n+1; i++) {
                dp[i] = dp[i-1]+dp[i-2];
            }
            return dp[n];
        }
    }
}
