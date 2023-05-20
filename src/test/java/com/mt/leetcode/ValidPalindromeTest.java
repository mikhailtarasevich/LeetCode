package com.mt.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {

    ValidPalindrome vp = new ValidPalindrome();

    @Test
    void isPalindrome_inputPalindrome_outputTrue () {
        String s = "0A man, a plan, a canal: Panama0";
        assertTrue(vp.isPalindrome(s));
    }

    @Test
    void isPalindrome_inputNotPalindrome_outputFalse () {
        String s = "0P";
        assertFalse(vp.isPalindrome(s));
    }

}