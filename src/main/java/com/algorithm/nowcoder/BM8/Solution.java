package com.algorithm.nowcoder.BM8;

/**
 * @author cuibaoqiang
 * @date 2023-02-17 22:39:28
 * @desc BM8 链表中倒数最后k个结点
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(7, new ListNode(9)))));
        ListNode node = code.FindKthToTail(l1, 2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param pHead ListNode类
     * @param k int整型
     * @return ListNode类
     */
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        ListNode tail = pHead;
        while (k > 0) {
            if (tail != null) {
                tail = tail.next;
            } else {
                return null;
            }
            k--;
        }
        while (tail != null) {
            tail = tail.next;
            pHead = pHead.next;
        }
        return pHead;
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
