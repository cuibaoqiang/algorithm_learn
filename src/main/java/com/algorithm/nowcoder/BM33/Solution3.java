package com.algorithm.nowcoder.BM33;

import java.util.Stack;

/**
 * @author cuibaoqiang
 * @date 2023-07-06 14:56:39
 * @desc BM32 二叉树的镜像
 */
public class Solution3 {

    public static void main(String[] args) {
        Solution3 code = new Solution3();
        TreeNode node = new TreeNode(1);
        System.out.println(code.Mirror(node));
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * @param pRoot TreeNode类
     * @return TreeNode类
     */
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if (pRoot == null) {
            return pRoot;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(pRoot);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        return pRoot;
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
