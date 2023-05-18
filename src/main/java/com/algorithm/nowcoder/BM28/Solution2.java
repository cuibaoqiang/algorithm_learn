package com.algorithm.nowcoder.BM28;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author cuibaoqiang
 * @date 2023-04-26 08:33:26
 * @desc BM28 二叉树的最大深度
 */
public class Solution2 {

    public static void main(String[] args) {
        Solution2 code = new Solution2();
        TreeNode node = new TreeNode(1);
        System.out.println(code.maxDepth(node));

    }

    /**
     *
     * @param root TreeNode类
     * @return int整型
     */
    public int maxDepth (TreeNode root) {
        // write code here
        int depth = 0;
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            flag = !flag;
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            depth++;
        }
        return depth;
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
