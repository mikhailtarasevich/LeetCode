package com.mt.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParenthesesTest {

    private final ParenthesesValidator pv = new ParenthesesValidator();

    @Test
    void isValid_inputCorrectBrackets_outputTrue() {
        String b = "{()[]}[]{}[()()]";
        assertTrue(pv.isValid(b));
    }

    @Test
    void isValid_inputIncorrectBrackets_outputFalse() {
        String b = "{([]}[]{}[()()]";
        assertFalse(pv.isValid(b));
    }

    @Test
    void isValid_inputEmpty_outputTrue() {
        String b = "";
        assertTrue(pv.isValid(b));
    }

}