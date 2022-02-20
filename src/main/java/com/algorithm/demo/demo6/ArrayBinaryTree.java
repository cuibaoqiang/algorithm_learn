package com.algorithm.demo.demo6;

/**
 * @author cuibaoqiang
 * @date 2022-02-20 18:18:15
 * @desc 顺序存储二叉树遍历
 */
public class ArrayBinaryTree {
    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    public void frontShow(int index) {
        if (data == null || data.length == 0) {
            return;
        }
        // 先序遍历当前节点
        System.out.println(data[index]);
        // 处理左节点
        if (2 * index + 1 < data.length) {
            frontShow(2 * index + 1);
        }
        // 处理右节点
        if (2 * index + 2 < data.length) {
            frontShow(2 * index + 2);
        }
    }
}
