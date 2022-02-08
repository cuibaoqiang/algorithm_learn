package com.algorithm.leetcode;

/**
 * @author cuibaoqiang
 * @date 2022-02-08 16:47:35
 * @desc 整数反转
 */
public class LeetCode0007 {
    public static void main(String[] args) {
        LeetCode0007 code = new LeetCode0007();
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
