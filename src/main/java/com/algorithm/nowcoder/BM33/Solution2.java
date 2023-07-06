package com.algorithm.nowcoder.BM33;

/**
 * @author cuibaoqiang
 * @date 2023-07-06 14:56:39
 * @desc BM32 二叉树的镜像
 */
public class Solution2 {

    public static void main(String[] args) {
        Solution2 code = new Solution2();
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
        TreeNode left = Mirror(pRoot.left);
        TreeNode right = Mirror(pRoot.right);
        pRoot.left = right;
        pRoot.right = left;
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