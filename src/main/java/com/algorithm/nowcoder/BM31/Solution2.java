package com.algorithm.nowcoder.BM31;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author cuibaoqiang
 * @date 2023-05-25 08:26:16
 * @desc BM31 对称的二叉树
 */
public class Solution2 {

    public static void main(String[] args) {
        Solution2 code = new Solution2();
        TreeNode node = new TreeNode(1);
        System.out.println(code.isSymmetrical(node));

    }

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.offer(pRoot.left);
        q2.offer(pRoot.right);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode left = q1.poll();
            TreeNode right = q2.poll();

            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null || left.val != right.val) {
                return false;
            }
            q1.offer(left.left);
            q1.offer(left.right);

            q2.offer(right.right);
            q2.offer(right.left);

        }
        return true;
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
