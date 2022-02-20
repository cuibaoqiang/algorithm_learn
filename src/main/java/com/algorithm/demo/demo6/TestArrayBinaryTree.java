package com.algorithm.demo.demo6;

/**
 * @author cuibaoqiang
 * @date 2022-02-20 18:23:35
 * @desc 测试顺序存储二叉树
 */
public class TestArrayBinaryTree {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        ArrayBinaryTree tree = new ArrayBinaryTree(data);
        // 前序遍历
        tree.frontShow(0);
    }
}
