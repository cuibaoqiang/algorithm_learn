package com.algorithm.leetcode;

import java.util.Stack;

/**
 * @author cuibaoqiang
 * @date 2022-02-08 14:55:47
 * @desc LeetCode 0001 有效的括号
 */
public class LeetCode0020 {
    public static void main(String[] args) {
        LeetCode0020 code = new LeetCode0020();
        System.out.println(code.isValid("()[]{}"));

    }

    public boolean isValid(String s) {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (stack.empty()) {
                stack.push(array[i]);
            } else {
                Character p = stack.peek();
                if ((p == '(' && array[i] == ')') || (p == '[' && array[i] == ']') || (p == '{' && array[i] == '}')) {
                    stack.pop();
                }else {
                    stack.push(array[i]);
                }
            }
        }
        return stack.empty();
    }
}
