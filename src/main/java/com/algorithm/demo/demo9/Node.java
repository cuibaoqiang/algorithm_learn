package com.algorithm.demo.demo9;

/**
 * @author cuibaoqiang
 * @date 2022-02-21 00:03:39
 * @desc
 */
public class Node implements Comparable<Node> {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Node o) {
        return -(this.value - o.value);
    }

    @Override
    public String toString() {
        return "Node [value=" + value + "]";
    }
}