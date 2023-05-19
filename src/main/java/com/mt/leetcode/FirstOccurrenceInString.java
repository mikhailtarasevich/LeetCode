package com.mt.leetcode;

public class FirstOccurrenceInString {

    public int strStr(String haystack, String needle) {
        int pos = 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            pos = i;
            int j = i;
            int k = 0;
            while (haystack.charAt(j) == needle.charAt(k)) {
                if (needle.length() == k + 1) return pos;
                j++;
                k++;
            }
        }
        return -1;
    }

}
