package com.algorithm.nowcoder.BM13;

/**
 * @author cuibaoqiang
 * @date 2023-03-06 20:51:55
 * @desc BM13 判断一个链表是否为回文结构
 */
public class Solution {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(3, new ListNode(9)));
        Solution code = new Solution();
        System.out.println(code.isPail(l1));
    }

    /**
     *
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail (ListNode head) {
        // write code here
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode reverse = ReverseList(slow);
        while (reverse != null) {
            if (reverse.val != head.val) {
                return false;
            }
            reverse = reverse.next;
            head = head.next;
        }
        return true;
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

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
