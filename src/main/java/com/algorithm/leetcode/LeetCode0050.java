package com.algorithm.leetcode;

/**
 * @author cuibaoqiang
 * @date 2022-02-08 15:32:22
 * @desc Pow(x,n)
 */
public class LeetCode0050 {
    public static void main(String[] args) {
        LeetCode0050 code = new LeetCode0050();
        System.out.println(code.myPow(2, -2147483648));
    }

    public double myPow(double x, int n) {
        if (n == 0 || x == 1) {
            return 1;
        }
        long N = n;
        return N > 0 ? pow(x, N) : 1 / pow(x, -N);
    }

    public double pow(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = pow(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }
}
