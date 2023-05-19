package com.mt.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstOccurrenceInStringTest {

    private final FirstOccurrenceInString fos = new FirstOccurrenceInString();

    @Test
    void strStr_inputStrings_assertMinusOne() {
        String haystack = "leetcode";
        String needle = "leeto";

        assertEquals(-1, fos.strStr(haystack, needle));
    }

    @Test
    void strStr_inputStrings_assert0() {
        String haystack = "sadbutsad";
        String needle = "sad";

        assertEquals(0, fos.strStr(haystack, needle));
    }

    @Test
    void strStr_inputStrings_assert1() {
        String haystack = "asadbutsad";
        String needle = "sad";

        assertEquals(1, fos.strStr(haystack, needle));
    }

    @Test
    void strStr_inputStrings_assert8() {
        String haystack = "asaadbutsad";
        String needle = "sad";
        assertEquals(8, fos.strStr(haystack, needle));
    }

    @Test
    void strStr_inputStrings_assertMinus1() {
        String haystack = "asaadbutsa";
        String needle = "sad";
        assertEquals(-1, fos.strStr(haystack, needle));
    }

}