package com.algorithm.leetcode.LeetCode0025;

/**
 * @author cuibaoqiang
 * @date 2022-02-27 22:31:15
 * @desc LeetCode 0025 K 个一组翻转链表
 */
public class Solution {
    public static void main(String[] args) {
        Solution code = new Solution();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode node = code.reverseKGroup(l1, 2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode curr = head;
        ListNode next;
        dummy.next = head;
        int length = 0;

        while (head != null) {
            length++;
            head = head.next;
        }

        for (int i = 0; i < length / k; i++) {
            for (int j = 0; j < k - 1; j++) {
                next = curr.next;
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
            }
            prev = curr;
            curr = prev.next;
        }
        return dummy.next;
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
