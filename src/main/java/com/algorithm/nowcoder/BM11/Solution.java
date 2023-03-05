package com.algorithm.nowcoder.BM11;

import java.util.Stack;

/**
 * @author cuibaoqiang
 * @date 2023-03-05 22:27:19
 * @desc BM11 链表相加(二)
 */
public class Solution {

    public static void main(String[] args) {
        Solution.ListNode l1 = new Solution.ListNode(9, new ListNode(3, new ListNode(7)));
        Solution.ListNode l2 = new Solution.ListNode(6, new ListNode(3));
        Solution code = new Solution();
        ListNode node = code.addInList(l1, l2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    /**
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode addInList(ListNode head1, ListNode head2) {
        // write code here
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        Stack<ListNode> result = new Stack<>();
        while (head1 != null) {
            stack1.push(head1);
            head1 = head1.next;
        }
        while (head2 != null) {
            stack2.push(head2);
            head2 = head2.next;
        }

        boolean temp = false;
        while (!stack1.isEmpty() || !stack2.empty()) {
            int tempSum = 0;
            if (!stack1.isEmpty() && !stack2.empty()) {
                tempSum = stack1.pop().val + stack2.pop().val + (temp ? 1 : 0);
            } else if (!stack1.isEmpty()) {
                tempSum = stack1.pop().val + (temp ? 1 : 0);
            } else if (!stack2.isEmpty()) {
                tempSum = stack2.pop().val + (temp ? 1 : 0);
            }
            temp = tempSum >= 10;
            result.push(new ListNode(temp ? tempSum - 10 : tempSum));
        }
        if (temp) {
            result.push(new ListNode(1));
        }
        ListNode head = null;
        ListNode h = null;
        while (!result.isEmpty()) {
            if (head == null) {
                head = result.pop();
                h = head;
            } else {
                head.next = result.pop();
                head = head.next;
            }
        }
        return h;
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
