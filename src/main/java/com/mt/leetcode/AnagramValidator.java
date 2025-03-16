package com.mt.leetcode;

import java.util.HashMap;
import java.util.Map;

public class AnagramValidator {

    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> sLetters = new HashMap<>();
        for(Character c : s.toCharArray()) {
            sLetters.put(c, sLetters.getOrDefault(c, 0) + 1);
        }

        for(Character c : t.toCharArray()) {
            if(sLetters.containsKey(c)){
                int count = sLetters.get(c);
                if (count > 0) {
                    sLetters.put(c, sLetters.get(c) - 1);
                    continue;
                }
                return false;
            }
            return false;
        }
        return true;

    }

}
