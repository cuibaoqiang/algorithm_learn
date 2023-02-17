package com.algorithm.nowcoder.BM7;

/**
 * @author cuibaoqiang
 * @date 2023-02-17 22:25:12
 * @desc BM7 链表中环的入口结点
 */
public class Solution {

    public static void main(String[] args) {
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode fast = pHead;
        ListNode slow = pHead;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.equals(fast)) {
               break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = pHead;
        while (!fast.equals(slow)) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
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
