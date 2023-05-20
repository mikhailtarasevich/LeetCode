package com.mt.leetcode;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String modifiedString = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        StringBuilder sb = new StringBuilder(modifiedString);
        String reversed = sb.reverse().toString();

        return modifiedString.equals(reversed);
    }

}
