package com.leetCode.hot100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution20 {
    public static void main(String[] args) {
        Solution20 s = new Solution20();
        String str = "()[]{";
        System.out.println(s.isValid(str));
    }

    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for (char value : c) {
            if (!stack.isEmpty() && stack.peek().equals(map.get(value))) {
                stack.pop();
            } else {
                stack.push(value);
            }
        }
        return stack.empty();
    }
}
