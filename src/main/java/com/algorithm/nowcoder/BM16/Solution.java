package com.algorithm.nowcoder.BM16;

/**
 * @author cuibaoqiang
 * @date 2023-03-08 08:15:53
 * @desc BM16 删除有序链表中重复的元素-II
 */
public class Solution {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(3,new ListNode(3))));
        Solution code = new Solution();
        ListNode node = code.deleteDuplicates(l1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    /**
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode tmp = node;

        while (tmp.next != null && tmp.next.next != null) {
            if (tmp.next.val == tmp.next.next.val) {
                int temp = tmp.next.val;
                while (tmp.next != null && tmp.next.val == temp) {
                    tmp.next = tmp.next.next;
                }
            } else {
                tmp = tmp.next;
            }
        }
        return node.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
