package com.algorithm.demo.demo5;

import java.util.Stack;

/**
 * @author cuibaoqiang
 * @date 2022-02-17 22:34:53
 * @desc 二叉树
 */
public class BinaryTree {

    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void frontShow() {
        if (root != null) {
            root.frontShow();
        }
    }

    public void midShow() {
        if (root != null) {
            root.midShow();
        }
    }

    public void afterShow() {
        if (root != null) {
            root.afterShow();
        }
    }

    public TreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }

    public void delete(int i) {
        if (root.value == i) {
            root = null;
        } else {
            root.delete(i);
        }
    }

    // 非递归前序遍历
    public void preOrder() {
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.empty()) {
                TreeNode p = stack.pop();
                if (p != null) {
                    System.out.println(p.value);
                    stack.push(p.rightNode);
                    stack.push(p.leftNode);
                }
            }
        }
    }

    // 非递归中序遍历
    public void inOrder() {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (!stack.empty() || p != null) {
            while (p != null) {
                stack.push(p);
                p = p.leftNode;
            }
            p = stack.pop();
            System.out.println(p.value);
            if (p.rightNode != null) {
                p = p.rightNode;
            } else {
                p = null;
            }
        }
    }

    // 非递归后序遍历
    public void postOrder() {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;

        while (!stack.empty() || p != null) {
            while (p != null) {
                stack.push(p);
                p = p.leftNode;
            }
            p = stack.pop();
            System.out.println(p.value);
            if (!stack.empty() && p == stack.peek().leftNode) {
                p = stack.peek().rightNode;
            } else {
                p = null;
            }
        }
    }
}
