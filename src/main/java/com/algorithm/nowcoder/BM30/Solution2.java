package com.algorithm.nowcoder.BM30;

import java.util.Stack;

/**
 * @author cuibaoqiang
 * @date 2023-05-22 18:34:08
 */
public class Solution2 {

    public static void main(String[] args) {
        Solution2 code = new Solution2();
        TreeNode node = new TreeNode(1);
        System.out.println(code.Convert(node));
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        //设置栈用于遍历
        Stack<TreeNode> s = new Stack<>();
        TreeNode head = null;
        TreeNode pre = null;
        //确认第一个遍历到最左，即为首位
        boolean isFirst = true;
        while (pRootOfTree != null || !s.isEmpty()) {
            //直到没有左节点
            while (pRootOfTree != null) {
                s.push(pRootOfTree);
                pRootOfTree = pRootOfTree.left;
            }
            pRootOfTree = s.pop();
            //最左元素即表头
            if (isFirst) {
                head = pRootOfTree;
                pre = head;
                isFirst = false;
                //当前节点与上一节点建立连接，将pre设置为当前值
            } else {
                pre.right = pRootOfTree;
                pRootOfTree.left = pre;
                pre = pRootOfTree;
            }
            pRootOfTree = pRootOfTree.right;
        }
        return head;
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
