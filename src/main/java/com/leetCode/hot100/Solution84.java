package com.leetCode.hot100;

public class Solution84 {
    public static void main(String[] args) {

    }
    public int[] largestRectangleAreaMonitor(int[] heights) {
        if (heights == null || heights.length == 0) {
            return null;
        }
        int[] h = new int[heights.length+2];
        h[0] = 0;
        h[h.length-1]= 0;
        for (int i = 1; i < h.length-1; i++) {
            h[i] = heights[i-1];
        }
        return h;
    }

    public int largestRectangleArea(int[] heights) {
        int[] h = largestRectangleAreaMonitor(heights);
        heights = h;
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            int l = 0;
            int r = 0;
            for (int j = i; j < heights.length; j++) {
                if (heights[j] < heights[i]) {
                    r = j;
                    break;
                }
            }
            for (int j = i; j > 0; j--) {
                if (heights[j] < heights[i]) {
                    l = j;
                    break;
                }
            }
            int wide = r - l - 1;
            int height = heights[i];
            int area = wide * height;
            res = Math.max(res, area);
        }
        return res;
    }
}
