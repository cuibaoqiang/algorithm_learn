package com.algorithm.剑指offer.剑指offer06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cuibaoqiang
 * @date 2021-09-07 10:41:36
 * @desc 从尾到头打印链表
 */
public class Solution {
    public static void main(String[] args) {
        Solution code = new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        System.out.println(Arrays.toString(code.reversePrint(node1)));
    }

    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(list.size() - 1 - i);
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
