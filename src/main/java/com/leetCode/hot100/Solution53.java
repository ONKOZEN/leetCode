package com.leetCode.hot100;

public class Solution53 {
    public static void main(String[] args) {
        Solution53 s = new Solution53();
        //int[] n = {-1, -2, 3, 4, 5, -6, -7, 8, 9};
        int[] n = {-1, -2};
        System.out.println(s.maxSubArray(n));
    }
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for(int num:nums){
            if(sum>0){sum+=num;}
            else{sum=num;}
            res=Math.max(res,sum);
        }
        return res;
    }
}
