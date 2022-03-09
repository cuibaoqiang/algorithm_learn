package com.algorithm.剑指offer.剑指offer35;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cuibaoqiang
 * @date 2022-03-04 15:41:04
 * @desc 复杂链表的复制
 */
public class Solution {

    Map<Node, Node> cache = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) { return null; }
        if (!cache.containsKey(head)) {
            Node node = new Node(head.val);
            cache.put(head, node);
            node.next = copyRandomList(head.next);
            node.random = copyRandomList(head.random);
        }
        return cache.get(head);
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
