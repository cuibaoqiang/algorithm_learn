package com.algorithm.leetcode;

/**
 * @author cuibaoqiang
 * @date 2021-09-02 16:22:06
 * @desc 两数相加
 */
public class LeetCode0002 {
    //    l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    public static void main(String[] args) {
        LeetCode0002 code = new LeetCode0002();
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))));

        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode node = code.addTwoNumbers(l1, l2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempNode = new ListNode(0);
        ListNode head = tempNode;
        int temp = 0;
        while (l1 != null && l2 != null) {
            temp = temp + l1.val + l2.val;
            tempNode.next = new ListNode(temp % 10);
            l1 = l1.next;
            l2 = l2.next;
            temp = temp / 10;
            tempNode = tempNode.next;
        }
        while (l1 != null) {
            temp = temp + l1.val;
            tempNode.next = new ListNode(temp % 10);
            l1 = l1.next;
            temp = temp / 10;
            tempNode = tempNode.next;
        }
        while (l2 != null) {
            temp = temp + l2.val;
            tempNode.next = new ListNode(temp % 10);
            l2 = l2.next;
            temp = temp / 10;
            tempNode = tempNode.next;
        }


        if (temp != 0) {
            tempNode.next = new ListNode(temp);
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
