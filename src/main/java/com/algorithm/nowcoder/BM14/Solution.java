package com.algorithm.nowcoder.BM14;

/**
 * @author cuibaoqiang
 * @date 2023-03-06 21:58:57
 * @desc BM14 链表的奇偶重排
 */
public class Solution {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(3, new ListNode(9)));
        Solution code = new Solution();
        ListNode node = code.oddEvenList(l1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode oddEvenList (ListNode head) {
        // write code here
        if (head == null) {
            return head;
        }
        ListNode evenHead = head.next;
        ListNode oddp = head, evenp = head.next;
        while (evenp != null && evenp.next != null) {
            oddp.next = evenp.next;
            oddp = oddp.next;
            evenp.next = oddp.next;
            evenp = evenp.next;
        }
        oddp.next = evenHead;
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
