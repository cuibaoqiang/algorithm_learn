package com.algorithm.剑指offer.剑指offer09;

import java.util.Stack;

/**
 * @author cuibaoqiang
 * @date 2022-02-09 17:00:16
 * @desc 用两个栈实现队列
 */
public class CQueue {
    Stack<Integer> a, b;

    public CQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void appendTail(int value) {
        a.push(value);
    }

    public int deleteHead() {
        if (a.empty()) {
            return -1;
        }
        while (!a.empty()) {
            b.push(a.pop());
        }
        int head = b.pop();
        while (!b.empty()) {
            a.push(b.pop());
        }
        return head;
    }
}
