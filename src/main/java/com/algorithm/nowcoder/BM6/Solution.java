package com.algorithm.nowcoder.BM6;

/**
 * @author cuibaoqiang
 * @date 2023-02-14 08:36:49
 * @desc BM6 判断链表中是否有环
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.equals(fast)) {
                return true;
            }
        }
        return false;
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
