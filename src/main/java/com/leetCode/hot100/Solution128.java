package com.leetCode.hot100;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution128 {
    public static void main(String[] args) {
        int[] s = {1, 2, 0, 1};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        System.out.println(new Solution128().longestConsecutive(s));
    }

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }
        Set<Integer> set = new HashSet<>();
        for (Integer i : nums) {
            set.add(i);
        }
        int res = 0;
        for (Integer i : set) {
            if (!set.contains(i - 1)) {
                int y = i;
                while (set.contains(y + 1)) {
                    y++;
                }
                res = Math.max(res, y - i + 1);
            }
        }
        return res;

    }
}
