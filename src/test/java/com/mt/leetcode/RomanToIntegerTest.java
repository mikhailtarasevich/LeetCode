package com.mt.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    private final RomanToInteger c = new RomanToInteger();

    @Test
    void romanToInt_inputX_output10() {
        String roman10 = "X";
        assertEquals(10, c.romanToInt(roman10));
    }

    @Test
    void romanToInt_inputXIV_output14() {
        String roman14 = "XIV";
        assertEquals(14, c.romanToInt(roman14));
    }

    @Test
    void romanToInt_inputXX_output20() {
        String roman20 = "XX";
        assertEquals(20, c.romanToInt(roman20));
    }

    @Test
    void romanToInt_inputXXXIV_output34() {
        String roman34 = "XXXIV";
        assertEquals(34, c.romanToInt(roman34));
    }

    @Test
    void romanToInt_inputXLV_output45() {
        String roman45 = "XLV";
        assertEquals(45, c.romanToInt(roman45));
    }

    @Test
    void romanToInt_inputXLIV_output44() {
        String roman44 = "XLIV";
        assertEquals(44, c.romanToInt(roman44));
    }

    @Test
    void romanToInt_inputLXXVIII_output78() {
        String roman78 = "LXXVIII";
        assertEquals(78, c.romanToInt(roman78));
    }

    @Test
    void romanToInt_inputLDCXXI_output621() {
        String roman621 = "DCXXI";
        assertEquals(621, c.romanToInt(roman621));
    }

    @Test
    void romanToInt_inputMCDLXXVI_output1476() {
        String roman1476 = "MCDLXXVI";
        assertEquals(1476, c.romanToInt(roman1476));
    }

    @Test
    void romanToInt_inputLXXXVIII_output88() {
        String roman88 = "LXXXVIII";
        assertEquals(88, c.romanToInt(roman88));
    }

    @Test
    void romanToInt_inputMMCMLXIV_output2964() {
        String roman2964 = "MMCMLXIV";
        assertEquals(2964, c.romanToInt(roman2964));
    }

    @Test
    void romanToInt_inputMDCCCLXXXIV_output1884() {
        String roman1884 = "MDCCCLXXXIV";
        assertEquals(1884, c.romanToInt(roman1884));
    }

    @Test
    void romanToInt_inputMMCDL_output2450() {
        String roman2450 = "MMCDL";
        assertEquals(2450, c.romanToInt(roman2450));
    }

}
