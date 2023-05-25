package com.algorithm.nowcoder.BM32;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author cuibaoqiang
 * @date 2023-05-25 14:43:55
 * @desc BM32 合并二叉树
 */
public class Solution2 {

    public static void main(String[] args) {
        Solution2 code = new Solution2();
        TreeNode node = new TreeNode(1);
        System.out.println(code.mergeTrees(node, node));

    }

    TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        } else if (t2 == null) {
            return t1;
        }
        TreeNode head = new TreeNode(t1.val + t2.val);
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q.offer(head);
        q1.offer(t1);
        q2.offer(t2);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode node = q.poll();
            TreeNode node1 = q1.poll();
            TreeNode node2 = q2.poll();
            TreeNode left1 = node1.left;
            TreeNode left2 = node2.left;
            TreeNode right1 = node1.right;
            TreeNode right2 = node2.right;

            if (left1 != null || left2 != null) {
                if (left1 != null && left2 != null) {
                    TreeNode left = new TreeNode(left1.val + left2.val);
                    node.left = left;
                    q.offer(left);
                    q1.offer(left1);
                    q2.offer(left2);
                } else if (left1 == null) {
                    node.left = left1;
                } else {
                    node.left = left2;
                }
            }
            if (right1 != null || right2 != null) {
                if (right1 != null && right2 != null) {
                    TreeNode right = new TreeNode(right1.val + right2.val);
                    node.right = right;
                    q.offer(right);
                    q1.offer(right1);
                    q2.offer(right2);
                } else if (right1 == null) {
                    node.right = right1;
                } else {
                    node.right = right2;
                }
            }
        }
        return head;
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
