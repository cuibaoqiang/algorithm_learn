package com.algorithm.剑指offer.剑指offer10II;

/**
 * @author cuibaoqiang
 * @date 2022-02-28 16:48:37
 * @desc 青蛙跳台阶
 */
public class Solution {
    public static void main(String[] args) {
        Solution code = new Solution();
        System.out.println(code.numWays(44));
    }

    public int numWays(int n) {
        // 只有0阶
        if (n == 0) {
            return 1;
        }
        // 只有一阶
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 1;
        for (int i = 2; i <= n; i++) {
            int temp = second;
            second = (first + second) % 1000000007;
            first = temp;
        }
        return second;
    }
}
