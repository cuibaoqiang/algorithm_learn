package com.algorithm.nowcoder.BM9;

/**
 * @author cuibaoqiang
 * @date 2023-02-17 22:58:51
 * @desc BM9 删除链表的倒数第n个节点
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(7, new ListNode(9)))));
        ListNode node = code.removeNthFromEnd(l1, 2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    /**
     *
     * @param head ListNode类
     * @param n int整型
     * @return ListNode类
     */
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        ListNode tail = head;
        ListNode phead = head;
        while (n > 1) {
            if (tail != null) {
                tail = tail.next;
            } else {
                return null;
            }
            n--;
        }

        while (tail != null) {
            tail = tail.next;
            if (tail == null) {
                return head.next;
            } else if (tail.next == null) {
                head.next = head.next.next;
                break;
            } else {
                head = head.next;
            }
        }
        return phead;
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
