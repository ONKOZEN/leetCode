package com.leetCode.hot100;

import java.util.*;

public class Solution448 {
    public static void main(String[] args) {

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return null;
        }
        Set<Integer> set = new HashSet<>();
        for (Integer i : nums) {
            set.add(i);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = nums[0]; i < nums[nums.length + 1]; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }

}
