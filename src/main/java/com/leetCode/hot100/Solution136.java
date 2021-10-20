package com.leetCode.hot100;

import java.util.HashMap;
import java.util.Map;

public class Solution136 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4};
        System.out.println(singleNumber1(nums));
    }
    public static int singleNumber1(int[] nums) {
        if (nums != null) {
            int flag = nums[0];
            for (int i = 1; i < nums.length; i++) {
                flag = flag^nums[i];
            }
            return flag;
        }
        return -1;
    }
    public static int singleNumber(int[] nums) {
        if (nums != null) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    map.remove(nums[i]);
                } else {
                    map.put(nums[i], nums[i]);
                }
            }
            return (int) map.values().toArray()[0];
        }
        return -1;
    }
}
