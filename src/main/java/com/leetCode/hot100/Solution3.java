package com.leetCode.hot100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3 {
    public static void main(String[] args) {
        String s = "ababcabcd";
        System.out.println(new Solution3().lengthOfLongestSubstring(s));

    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int flag = 0;
            for (int j = i+1; j < s.length(); j++) {
             if(s.substring(i,j).contains(s.substring(j))){
                 flag = j-i;
                 break;
             }else {
                 flag+=1;
             }
            }
            res = Math.max(res,flag);
        }
        return res;
    }
}
