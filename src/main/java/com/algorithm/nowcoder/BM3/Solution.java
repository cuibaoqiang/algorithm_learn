package com.algorithm.nowcoder.BM3;

/**
 * @author cuibaoqiang
 * @date 2023-02-11 21:49:55
 * @desc BM3 链表中的节点每k个一组翻转
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

    /**
     *
     * @param head ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public ListNode reverseKGroup (ListNode head, int k) {

        int len = 0;
        int pre = 1;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preStart = dummy;
        ListNode start = head;
        while (len >= k) {
            for (int i = 1; i < pre; i ++ ) {
                preStart = start;
                start = start.next;
            }
            // reverse
            for (int i = 0; i < k - 1; i ++ ) {
                ListNode temp = start.next;
                start.next = temp.next;
                temp.next = preStart.next;
                preStart.next = temp;
            }
            len = len - k;
            pre = pre + k;
            start = dummy.next;
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
