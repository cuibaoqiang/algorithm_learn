package com.algorithm.nowcoder.BM12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

/**
 * @author cuibaoqiang
 * @date 2023-03-05 23:15:50
 * @desc BM12 单链表的排序
 */
public class Solution {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(3, new ListNode(7)));
        Solution code = new Solution();
        ListNode node = code.sortInList(l1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    /**
     * @param head ListNode类 the head node
     * @return ListNode类
     */
    public ListNode sortInList(ListNode head) {
        // write code here
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        ListNode node = new ListNode(0);
        ListNode result = node;
        list.sort(Comparator.comparingInt(o -> o.val));
        for (ListNode cur : list) {
            node.next = new ListNode(cur.val);
            node = node.next;
        }
        return result.next;
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
