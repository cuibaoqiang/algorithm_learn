package com.algorithm.leetcode.LeetCode0070;

/**
 * @author cuibaoqiang
 * @date 2022-02-28 16:18:36
 * @desc 爬楼梯
 */
public class Solution {
    public static void main(String[] args) {
        Solution code = new Solution();
        System.out.println(code.climbStairs(44));
    }

    public int climbStairs(int n) {
        // 只有一阶
        if (n == 1) {
            return 1;
        }
        // 只有二阶
        if (n == 2) {
            return 2;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int temp = second;
            second = first + second;
            first = temp;
            System.out.println(i + "\t" + second);
        }
        return second;
    }
}
