package com.algorithm.nowcoder.BM28;

/**
 * @author cuibaoqiang
 * @date 2023-04-26 08:33:26
 * @desc BM28 二叉树的最大深度
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
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
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
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
