package com.algorithm.demo.demo5;

/**
 * @author cuibaoqiang
 * @date 2022-02-17 22:39:27
 * @desc 测试二叉树
 */
public class TestBinaryTree {

    public static void main(String[] args) {
        // 创建一棵树
        BinaryTree binTree = new BinaryTree();
        // 创建一个根节点
        TreeNode root = new TreeNode(1);
        // 把根节点赋值给树
        binTree.setRoot(root);
        // 创建一个左节点
        TreeNode rootL = new TreeNode(2);
        //把新创建的节点设置为根节点的子节点
        root.setLeftNode(rootL);
        //创建一个右节点
        TreeNode rootR = new TreeNode(3);
        //把新创建的节点设置为根节点的子节点
        root.setRightNode(rootR);
        //为第二层的左节点创建两个子节点
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        //为第二层的右节点创建两个子节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
        //前序遍历树
        binTree.frontShow();
        System.out.println("========递归前序遍历========");
        binTree.preOrder();
        System.out.println("========非递归前序遍历========");
        //中序遍历
        binTree.midShow();
        System.out.println("========递归中序遍历========");
        binTree.inOrder();
        System.out.println("========非递归中序遍历========");
        //后序遍历
        binTree.afterShow();
        System.out.println("========递归后续遍历========");
        binTree.postOrder();
        System.out.println("========非递归后续遍历========");
        //前序查找
        TreeNode result = binTree.frontSearch(5);
        System.out.println(result);

        System.out.println("===============");
        //删除一个子树
        binTree.delete(1);
        binTree.frontShow();
    }
}
