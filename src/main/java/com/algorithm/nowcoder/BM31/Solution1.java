package com.algorithm.nowcoder.BM31;

/**
 * @author cuibaoqiang
 * @date 2023-05-23 22:42:18
 * @desc BM31 对称的二叉树
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 code = new Solution1();
        TreeNode node = new TreeNode(1);
        System.out.println(code.isSymmetrical(node));

    }

    boolean isSymmetrical(TreeNode pRoot) {
        return recursion(pRoot, pRoot);
    }

    boolean recursion(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null || root1.val != root2.val) {
            return false;
        }
        return recursion(root1.left, root2.right) && recursion(root1.right, root2.left);
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
