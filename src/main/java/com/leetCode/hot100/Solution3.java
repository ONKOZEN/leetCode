package com.leetCode.hot100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3 {
    public static void main(String[] args) {
        String s = "abcdefgcdefghijklmn";
        System.out.println(new Solution3().lengthOfLongestSubstring(s));

    }

    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int me = 0;
        int ms = 0;
        for (int start = 0, end = 0; end < s.length(); end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(start, map.get(s.charAt(end)) + 1);
            }
            if(end-start+1>max){
                me = end;
                ms = start;
            }
            max = Math.max(max,end-start+1);
            map.put(s.charAt(end),end);
        }
        System.out.println(s.substring(ms,me+1));
        return max;
    }
}
