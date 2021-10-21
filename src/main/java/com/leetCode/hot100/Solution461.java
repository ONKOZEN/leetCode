package com.leetCode.hot100;

public class Solution461 {
    public static void main(String[] args) {
        System.out.println(new Solution461().hammingDistance(1, 3));
    }

    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int flag = 0;
        while (z != 0) {
            if ((z & 1) == 1) {
                flag += 1;
            }
            z = z >>> 1;
        }
        return flag;
    }
}
