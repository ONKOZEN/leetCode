package com.leetCode.hot100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3 {
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(new Solution3().lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }
        char[] c = s.toCharArray();
        Map<Character, Integer> list = new HashMap<>();
        int rec = 0;
        int lastFlag = 0;
        int startFlag = 0;
        for (int i = 0; i < c.length; i++) {
            if (list.containsKey(c[i])) {
                rec = Math.max(rec, i - list.get(c[i]));
                lastFlag = i;
                list.clear();
            } else if (i == c.length - 1) {
                rec = Math.max(rec, i - lastFlag + 1);
                lastFlag = i;
                list.clear();
            }
            list.put(c[i], i);
        }
        return rec;

    }
}
