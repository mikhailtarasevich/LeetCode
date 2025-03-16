package com.mt.leetcode;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 10, 12}, 0));
        System.out.println(search(new int[]{-1, 0}, -1));
    }

    public static int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    public static int search(int[] nums, int startIdx, int lastIdx, int target) {
        if (startIdx == lastIdx) return nums[startIdx] == target ? startIdx : -1;

        int middle = ((lastIdx - startIdx) / 2) + startIdx;

        if (target <= nums[middle]) {
            return search(nums, startIdx, middle, target);
        } else {
            return search(nums, middle + 1, lastIdx, target);
        }
    }

}
