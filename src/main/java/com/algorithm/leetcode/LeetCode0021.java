package com.algorithm.leetcode;

/**
 * @author cuibaoqiang
 * @date 2022-02-08 10:58:09
 * @desc 合并两个有序链表
 */
public class LeetCode0021 {
    //    l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    public static void main(String[] args) {
        LeetCode0021 code = new LeetCode0021();
        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(9, new ListNode(9, new ListNode(9)))));

        ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(9, new ListNode(9))));

        ListNode node = code.mergeTwoLists(l1, l2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode tempNode = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tempNode.next = list1;
                list1 = list1.next;
            } else {
                tempNode.next = list2;
                list2 = list2.next;
            }
            tempNode = tempNode.next;
        }

        while (list1 != null) {
            tempNode.next = list1;
            list1 = list1.next;
            tempNode = tempNode.next;
        }

        while (list2 != null) {
            tempNode.next = list2;
            list2 = list2.next;
            tempNode = tempNode.next;
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
