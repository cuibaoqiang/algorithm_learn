package com.algorithm.nowcoder.BM15;

/**
 * @author cuibaoqiang
 * @date 2023-03-08 08:15:53
 * @desc BM15 删除有序链表中重复的元素-I
 */
public class Solution {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3, new ListNode(3, new ListNode(3)));
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
        ListNode tmp = head;
        while (tmp != null && tmp.next != null) {
            if (tmp.val == tmp.next.val) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
        return head;
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
