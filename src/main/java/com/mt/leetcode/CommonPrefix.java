package com.mt.leetcode;

public class CommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) return strs[0];

        char[] pref = getShortestStringToArray(strs);
        int threshold = pref.length;

        for (String str : strs) {
            char[] arr = str.toCharArray();
            for (int j = 0; j < threshold; j++) {
                if (arr[j] != pref[j]) {
                    threshold = j;
                }
            }
        }

        if (threshold == 0) return "";
        else return new String(pref).substring(0, threshold);
    }

    private char[] getShortestStringToArray(String[] arr) {
        int min = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < min) {
                min = arr[i].length();
                minPosition = i;
            }
        }

        return arr[minPosition].toCharArray();
    }

}
