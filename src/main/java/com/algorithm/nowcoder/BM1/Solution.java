package com.algorithm.nowcoder.BM1;

/**
 * @author cuibaoqiang
 * @date 2023-02-11 21:16:55
 * @desc BM1 反转链表
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode node = code.ReverseList(l1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode ReverseList(ListNode head) {
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