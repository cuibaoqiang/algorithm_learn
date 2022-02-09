package com.algorithm.leetcode.LeetCode0001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author cuibaoqiang
 * @date 2021-09-01 16:37:24
 * @desc LeetCode 0001 两数之和
 */
public class Solution {
    public static void main(String[] args) {
        Solution code = new Solution();
        System.out.println(Arrays.toString(code.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (temp.containsKey(complement)) {
                return new int[]{temp.get(complement), i};
            }
            temp.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
