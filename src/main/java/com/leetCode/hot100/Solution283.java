package com.leetCode.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution283 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 0, 4, 5, 0, 6, 0, 7, 0, 8, 9};
        new Solution283().moveZeroes2(n);
        System.out.println(Arrays.toString(n));

    }

    public void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num != 0) {
                list.add(num);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        for (int i = list.size(); i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    //双指针法
    public void moveZeroes2(int[] nums) {
        int formedEnd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[formedEnd] = nums[i];
                formedEnd += 1;
            }
        }
        for (int j = formedEnd; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
