package com.leetCode.hot100;

import java.util.ArrayList;
import java.util.List;

public class Solution46 {
    public static void main(String[] args) {
        List<List<Integer>> res = null;
        int[] nums = {1, 2, 3};
        res = new Solution78().subsets(nums);
        String s = null;
        s = "sdf";
    }
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path =  new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        if(nums == null){
            return null;
        }
        bfs(nums);
        return res;
    }

    public void bfs(int[] nums) {
        if(nums == null){
            return;
        }

        for (int j = 0; j < nums.length; j++) {
            path.add(j);
            for (int i = 0; i < nums.length; i++) {
                if(path.contains(i)){
                    continue;
                }
                path.add(i);
            }
            res.add(path);
        }
    }

}
