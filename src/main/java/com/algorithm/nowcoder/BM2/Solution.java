package com.algorithm.nowcoder.BM2;

/**
 * @author cuibaoqiang
 * @date 2023-02-11 21:18:53
 * @desc BM2 链表内指定区间反转
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode node = code.reverseBetween(l1, 3, 4);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preStart = dummy;
        ListNode start = head;
        for (int i = 1; i < m; i ++ ) {
            preStart = start;
            start = start.next;
        }
        // reverse
        for (int i = 0; i < n - m; i ++ ) {
            ListNode temp = start.next;
            start.next = temp.next;
            temp.next = preStart.next;
            preStart.next = temp;
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
