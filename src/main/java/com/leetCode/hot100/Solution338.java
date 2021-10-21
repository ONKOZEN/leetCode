package com.leetCode.hot100;

import java.util.Arrays;

public class Solution338 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution338().countBits(5)));
    }
    public int[] countBits(int n) {
        if(n == 0){
            return new int[]{0};
        }
        int[] arr = new int[n+1];
        for (int i = 0; i <= n ; i++) {
            arr[i] = count(i);
        }
        return arr;
    }

    public int count(int i) {
        int flag = 0;
        while (i != 0) {
            if ((i & 1) == 1) {
                flag += 1;
            }
            i >>>= 1;
        }
        return flag;
    }
}
