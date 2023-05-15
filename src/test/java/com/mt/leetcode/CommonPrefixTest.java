package com.mt.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CommonPrefixTest {

    private final CommonPrefix cp = new CommonPrefix();

    @Test
    void longestCommonPrefix_inputOneElementArr_outputPrefixEqualsThisElement() {
        String[] arr = {"go"};
        assertEquals(arr[0], cp.longestCommonPrefix(arr));
    }

    @Test
    void longestCommonPrefix_inputArrWithCommonPrefix_outputPrefix() {
        String[] arr = {"flower", "flow", "flight"};
        assertEquals("fl", cp.longestCommonPrefix(arr));
    }

    @Test
    void longestCommonPrefix_inputArrWithoutCommonPrefix_outputEmptyString() {
        String[] arr = {"flower", "flow", "reflight"};
        assertEquals("", cp.longestCommonPrefix(arr));
    }

}