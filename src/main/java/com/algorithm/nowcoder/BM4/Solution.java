package com.algorithm.nowcoder.BM4;

/**
 * @author cuibaoqiang
 * @date 2023-02-12 09:32:26
 * @desc BM4 合并两个排序的链表
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
        Solution.ListNode l1 = new Solution.ListNode(1, new Solution.ListNode(3, new Solution.ListNode(9, new Solution.ListNode(9, new Solution.ListNode(9)))));

        Solution.ListNode l2 = new Solution.ListNode(1, new Solution.ListNode(2, new Solution.ListNode(9, new Solution.ListNode(9))));

        Solution.ListNode node = code.Merge(l1, l2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        if (list1 != null) {
            cur.next = list1;
        }

        if (list2 != null) {
            cur.next = list2;
        }
        return head.next;
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
