package com.mt.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ParenthesesValidator {

    private static final Map<Character, Character> brackets = new HashMap<>(3);

    static {
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
    }

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (!brackets.containsKey(chars[i])) {
                stack.push(chars[i]);
            } else {
                char top = stack.isEmpty() ? '?' : stack.pop();
                if (top != brackets.get(chars[i])) return false;
            }
        }

        return stack.isEmpty();
    }

}
