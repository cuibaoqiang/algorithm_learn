package com.algorithm.leetcode;

/**
 * @author cuibaoqiang
 * @date 2021-09-03 15:03:43
 * @desc 回文数
 */
public class LeetCode0009 {
    public static void main(String[] args) {
        LeetCode0009 code = new LeetCode0009();
        System.out.println(code.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }
}
