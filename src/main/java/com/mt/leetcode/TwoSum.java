package com.mt.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoSum {

    public static void main(String[] args) {
        List<Integer> list = Arrays.stream(twoSum(new int[]{3,2,4}, 6)).boxed().collect(Collectors.toList());
        System.out.println(list);
    }

    public static int[] twoSumMySolution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(j != i && ((nums[i] + nums[j]) == target)) return new int[]{i, j};
            }
        }
        return null;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i ++) {
            int diff = target - nums[i];
            if(hashMap.containsKey(diff)) return new int[]{hashMap.get(diff), i};
            hashMap.put(nums[i], i);
        }
        throw new RuntimeException();
    }
}
