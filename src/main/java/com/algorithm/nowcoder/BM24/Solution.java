package com.algorithm.nowcoder.BM24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author cuibaoqiang
 * @date 2023-04-21 08:11:35
 * @desc BM24 二叉树的中序遍历
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();

        TreeNode node = new TreeNode(1);
        System.out.println(Arrays.toString(code.inorderTraversal(node)));

    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param root TreeNode类
     * @return int整型一维数组
     */
    public int[] inorderTraversal(TreeNode root) {
        // write code here
        List<Integer> list = new ArrayList<>();
        inOrder(list, root);
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    private void inOrder(List<Integer> list, TreeNode root){
        if (root == null) {
            return;
        }
        inOrder(list, root.left);
        list.add(root.val);
        inOrder(list, root.right);
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
