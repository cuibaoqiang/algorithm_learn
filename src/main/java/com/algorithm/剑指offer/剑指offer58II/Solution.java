package com.algorithm.剑指offer.剑指offer58II;

/**
 * @author cuibaoqiang
 * @date 2022-03-09 18:00:58
 * @desc 左旋转字符串
 */
public class Solution {
    public static void main(String[] args) {
        Solution code = new Solution();
        System.out.println(code.reverseLeftWords("asdfgh", 2));
        System.out.println(code.reverseLeftWords1("asdfgh", 2));
        System.out.println(code.reverseLeftWords2("asdfgh", 2));
    }

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    public String reverseLeftWords1(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            res.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    public String reverseLeftWords2(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = n; i < n + s.length(); i++) {
            res.append(s.charAt(i % s.length()));
        }
        return res.toString();
    }
}
