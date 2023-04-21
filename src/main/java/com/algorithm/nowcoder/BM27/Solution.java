package com.algorithm.nowcoder.BM27;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * @author cuibaoqiang
 * @date 2023-04-21 08:27:19
 * @desc BM27 按之字形顺序打印二叉树
 */
public class Solution {

    public static void main(String[] args) {
        Solution code = new Solution();
        TreeNode node = new TreeNode(1);
        System.out.println(code.Print(node));

    }


    public ArrayList<ArrayList<Integer>> Print (TreeNode pRoot) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) {
            return res;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(pRoot);
        boolean flag = true;
        while (!queue.isEmpty()) {
            ArrayList<Integer> row = new ArrayList<>();
            int size = queue.size();
            flag = !flag;
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (flag) {
                    row.add(0, cur.val);
                } else {
                    row.add(cur.val);
                }
                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            res.add(row);
        }
        return res;
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
