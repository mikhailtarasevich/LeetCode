package com.mt.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    private final PalindromeNumber p = new PalindromeNumber();

    @Test
    void isPalindrome_input123321_outputTrue() {
        assertTrue(p.isPalindrome(123321));
    }

    @Test
    void isPalindrome_inputOneDigit_outputTrue() {
        assertTrue(p.isPalindrome(5));
    }

    @Test
    void isPalindrome_inputBelowZero_outputFalse() {
        assertFalse(p.isPalindrome(-1));
    }

    @Test
    void isPalindrome_inputNotPalindrome_outputFalse() {
        assertFalse(p.isPalindrome(1234));
    }

    @Test
    void isPalindrome_inputZero_outputTrue() {
        assertTrue(p.isPalindrome(0));
    }

}