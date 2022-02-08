package com.algorithm.leetcode;

/**
 * @author cuibaoqiang
 * @date 2022-02-08 10:39:40
 * @desc 斐波那契数
 */
public class LeetCode0509 {
    public static void main(String[] args) {
        LeetCode0509 code = new LeetCode0509();
        System.out.println(code.fib(2));
    }

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
