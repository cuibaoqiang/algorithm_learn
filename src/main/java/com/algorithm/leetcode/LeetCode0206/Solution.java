package com.algorithm.leetcode.LeetCode0206;

/**
 * @author cuibaoqiang
 * @date 2022-02-28 00:01:02
 * @desc 反转链表
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode node = code.reverseList(l1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
