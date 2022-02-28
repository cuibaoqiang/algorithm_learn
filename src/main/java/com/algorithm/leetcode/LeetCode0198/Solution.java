package com.algorithm.leetcode.LeetCode0198;

/**
 * @author cuibaoqiang
 * @date 2022-02-28 15:45:39
 * @desc 打家劫舍
 */
public class Solution {
    public static void main(String[] args) {
        Solution code = new Solution();
        System.out.println(code.rob(new int[]{2, 7, 9, 3, 1}));
        System.out.println(code.rob1(new int[]{2, 7, 9, 3, 1}));
    }

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        sum[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            sum[i] = Math.max(sum[i - 2] + nums[i], sum[i - 1]);
        }
        return sum[nums.length - 1];
    }

    public int rob1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}
