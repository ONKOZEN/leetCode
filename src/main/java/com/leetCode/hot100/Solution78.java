package com.leetCode.hot100;

import java.util.ArrayList;
import java.util.List;

public class Solution78 {
    public static void main(String[] args) {
        List<List<Integer>> res = null;
        int[] nums = {1, 2, 3};
        res = new Solution78().subsets(nums);
        String s = null;
        s = "sdf";
    }

    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums, 0);
        return res;
    }

    public void dfs(int[] nums, int start) {
        res.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}