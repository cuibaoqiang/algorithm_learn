package com.algorithm.nowcoder.BM29;

/**
 * @author cuibaoqiang
 * @date 2023-04-26 08:39:01
 * @desc BM29 二叉树中和为某一值的路径(一)
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
        TreeNode node = new TreeNode(1);
        System.out.println(code.hasPathSum(node, 1));

    }

    /**
     *
     * @param root TreeNode类
     * @param sum int整型
     * @return bool布尔型
     */
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && sum - root.val == 0) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
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
