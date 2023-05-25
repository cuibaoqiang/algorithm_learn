package com.algorithm.nowcoder.BM32;

/**
 * @author cuibaoqiang
 * @date 2023-05-25 14:29:56
 * @desc BM32 合并二叉树
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 code = new Solution1();
        TreeNode node = new TreeNode(1);
        System.out.println(code.mergeTrees(node, node));

    }

    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        // write code here
        if (t1 == null && t2 == null) {
            return null;
        }

        if (t1 == null) {
            return t2;
        } else if (t2 == null) {
            return t1;
        }

        t1.val = t1.val + t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
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
