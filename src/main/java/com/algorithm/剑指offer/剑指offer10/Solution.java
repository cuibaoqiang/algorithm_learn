package com.algorithm.剑指offer.剑指offer10;

/**
 * @author cuibaoqiang
 * @date 2022-02-09 17:16:30
 * @desc 斐波那契数列
 */

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.fib(45));
        System.out.println(s.fib1(45));

    }
    final int MOD = 2000000007;

    // 动态规划
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int p = 0, q = 0, r = 1;
        for (int i = 2; i <= n; ++i) {
            p = q;
            q = r;
            r = (p + q) % MOD;
        }
        return r;
    }

    // 递归
    public int fib1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return (fib(n - 1) + fib(n - 2)) % MOD;
    }
}
