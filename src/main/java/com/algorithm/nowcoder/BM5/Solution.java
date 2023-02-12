package com.algorithm.nowcoder.BM5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author cuibaoqiang
 * @date 2023-02-12 11:55:37
 * @desc BM5 合并k个已排序的链表
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(9, new ListNode(9, new ListNode(9)))));

        ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(9, new ListNode(9))));

        ListNode node = code.mergeKLists(new ArrayList<>(Arrays.asList(l1, l2)));
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        int length = lists.size();
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            return lists.get(0);
        }
        return Merge(mergeKLists(new ArrayList<>(lists.subList(0,length / 2))), mergeKLists(new ArrayList<>(lists.subList(length / 2, lists.size()))));

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
