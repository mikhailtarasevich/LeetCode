package com.mt.leetcode.repeat;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindromeMySolution(String s) {
        char[] chars = s.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        for(int i = 0; i < chars.length / 2; i++) if(chars[i] != chars[chars.length - 1 - i]) return false;
        return true;
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int currStart = 0;
        int currLast = s.length() - 1;

        while (currStart < currLast){
            if(!Character.isLetterOrDigit(s.charAt(currStart))) {
                currStart++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(currLast))) {
                currLast--;
                continue;
            }
            if(s.charAt(currStart) != s.charAt(currLast)) return false;
            currStart++;
            currLast--;
        }

        return true;
    }

}
