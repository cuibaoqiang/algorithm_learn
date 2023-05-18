package com.algorithm.nowcoder.BM29;

import java.util.Stack;

/**
 * @author cuibaoqiang
 * @date 2023-04-26 08:39:01
 * @desc BM29 二叉树中和为某一值的路径(一)
 */
public class Solution2 {

    public static void main(String[] args) {
        Solution2 code = new Solution2();
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
        Stack<TreeNode> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(root);
        s2.push(root.val);

        while (!s1.empty()) {
            TreeNode temp = s1.pop();
            int curSum = s2.pop();
            if (temp.left == null && temp.right == null && curSum == sum) {
                return true;
            }

            if (temp.left != null) {
                s1.push(temp.left);
                s2.push(curSum + temp.left.val);
            }
            if (temp.right != null) {
                s1.push(temp.right);
                s2.push(curSum + temp.right.val);
            }
        }
        return false;
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
