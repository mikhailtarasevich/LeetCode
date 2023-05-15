package com.mt.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static final Map<Character, Integer> UNIQUE_CHARS = new HashMap<>();

    static {
        UNIQUE_CHARS.put('I', 1);
        UNIQUE_CHARS.put('V', 5);
        UNIQUE_CHARS.put('X', 10);
        UNIQUE_CHARS.put('L', 50);
        UNIQUE_CHARS.put('C', 100);
        UNIQUE_CHARS.put('D', 500);
        UNIQUE_CHARS.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;
        int currentIndex = 0;

        while (currentIndex < s.length()) {
            char currentChar = s.charAt(currentIndex);
            int currentValue = UNIQUE_CHARS.get(currentChar);

            if (currentIndex + 1 < s.length()) {
                char nextChar = s.charAt(currentIndex + 1);
                int nextValue = UNIQUE_CHARS.get(nextChar);

                if (currentValue < nextValue) {
                    result += nextValue - currentValue;
                    currentIndex += 2;
                } else {
                    result += currentValue;
                    currentIndex += 1;
                }
            } else {
                result += currentValue;
                currentIndex += 1;
            }
        }

        return result;
    }

}
