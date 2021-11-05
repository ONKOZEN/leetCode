package com.leetCode.hot100;

import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
        int[] n1 = {1, 3, 5};
        int[] n2 = {2, 4, 6};
        Solution4 solution4 = new Solution4();
        System.out.println(Arrays.toString(solution4.combine(n1, n2)));

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0;
    }

    private int[] combine(int[] nums1, int[] nums2) {
        int[] com = new int[nums1.length + nums2.length];
        int s1 = 0;
        int s2 = 0;
        while (s1+s2<com.length){
            if(nums1[s1]<nums2[s2]){
                com[s1+s2] = nums1[s1];
                if(s1<nums1.length-1){
                    s1+=1;
                }
            }else {
                com[s1+s2] = nums2[s2];
                if(s2<nums2.length-1){
                    s2+=1;
                }
            }
        }
        return com;
    }
}
