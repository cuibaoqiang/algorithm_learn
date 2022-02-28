package com.algorithm.leetcode.LeetCode0162;

/**
 * @author cuibaoqiang
 * @date 2021-09-02 16:22:06
 * @desc 寻找峰值
 */
public class Solution {
    public static void main(String[] args) {
        Solution code = new Solution();
        System.out.println(code.findPeakElement(new int[]{1, 2, 1, 3, 5, 8, 7}));
    }

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid + 1] > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
