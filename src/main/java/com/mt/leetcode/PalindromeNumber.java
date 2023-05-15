package com.mt.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        Deque<Integer> deque = new ArrayDeque<>();
        int n = x;
        int length = 0;

        while (n != 0) {
            deque.addLast(n % 10);
            n = n / 10;
            length++;
        }

        n = x;
        length = length / 2;

        while (length != 0) {
            if (deque.removeLast() != n % 10) return false;
            length--;
            n = n / 10;
        }

        return true;
    }

}
