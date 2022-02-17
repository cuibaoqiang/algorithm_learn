package com.algorithm.leetcode.LeetCode0237;

/**
 * @author cuibaoqiang
 * @date 2022-02-17 16:23:49
 * @desc 删除链表中的节点
 */
public class Solution {
    //    l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    public static void main(String[] args) {
        Solution code = new Solution();
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        code.deleteNode(l2);

        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }
    }
}
