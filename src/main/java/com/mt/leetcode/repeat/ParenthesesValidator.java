package com.mt.leetcode.repeat;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthesesValidator {

    public static void main(String... args) {
        System.out.println(isValid("(})[{}"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid(")["));
    }

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> openParentheses = new Stack<>();
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('}', '{');
        charMap.put(']', '[');
        charMap.put(')', '(');
        for (char aChar : chars) {
            if (charMap.containsKey(aChar)) {
                if(openParentheses.empty() || !openParentheses.pop().equals(charMap.get(aChar))) return false;
            } else {
                openParentheses.push(aChar);
            }
        }
        return openParentheses.empty();
    }

}
