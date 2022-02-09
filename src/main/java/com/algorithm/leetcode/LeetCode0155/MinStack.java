package com.algorithm.leetcode.LeetCode0155;

import java.util.Stack;

/**
 * @author cuibaoqiang
 * @date 2022-02-09 17:59:13
 * @desc 最小栈
 */
public class MinStack {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);

        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.getMin());
    }

    Stack<Integer> stack, temp;

    public MinStack() {
        stack = new Stack<>();
        temp = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (temp.empty() || x <= temp.peek()) {
            temp.push(x);
        }
    }

    public void pop() {
        int cur = stack.pop();
        if (cur == temp.peek()) {
            temp.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return temp.peek();
    }
}
