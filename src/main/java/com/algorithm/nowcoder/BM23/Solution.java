package com.algorithm.nowcoder.BM23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cuibaoqiang
 * @date 2023-04-19 08:39:56
 * @desc BM23 二叉树的前序遍历
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();

        TreeNode node = new TreeNode(1);
        System.out.println(Arrays.toString(code.preorderTraversal(node)));

    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param root TreeNode类
     * @return int整型一维数组
     */
    public int[] preorderTraversal(TreeNode root) {
        // write code here
        List<Integer> list = new ArrayList<>();
        preorder(list, root);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private void preorder(List<Integer> list, TreeNode root){
        if (root == null) {
            return;
        }
        list.add(root.val);
        preorder(list, root.left);
        preorder(list, root.right);
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
