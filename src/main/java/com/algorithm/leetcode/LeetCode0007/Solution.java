package com.algorithm.leetcode.LeetCode0007;

/**
 * @author cuibaoqiang
 * @date 2022-02-08 16:47:35
 * @desc 整数反转
 */
public class Solution {
    public static void main(String[] args) {
        Solution code = new Solution();
        System.out.println(code.reverse(-112345));

    }

    public int reverse(int x) {
        long res = 0;
        boolean isPositive = x > 0;
        if (!isPositive) {
            x *= -1;
        }
        while (x > 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        if (res > Integer.MAX_VALUE) {
            return 0;
        }
        if (isPositive) {
            return (int) res;
        }
        return (int) -res;
    }
}
