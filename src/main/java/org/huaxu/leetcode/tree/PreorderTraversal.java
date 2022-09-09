package org.huaxu.leetcode.tree;

import org.huaxu.common.TreeNode;

/**
 * @Author DongxuHua
 * @Date: 2022/9/8 4:03 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.leetcode.tree
 * 前序遍历
 */
public class PreorderTraversal {

    public void prePrint(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        prePrint(root.left);
        prePrint(root.right);

    }

    public static void main(String[] args) {
        TreeNode root4 = new TreeNode(4);
        TreeNode root2 = new TreeNode(2);
        TreeNode root6 = new TreeNode(6);

        TreeNode root1 = new TreeNode(1);
        TreeNode root3 = new TreeNode(3);

        TreeNode root5 = new TreeNode(5);
        TreeNode root7 = new TreeNode(7);

        TreeNode root8 = new TreeNode(8);

        root4.left = root2;
        root4.right = root6;

        root2.left = root1;
        root2.right = root3;

        root6.left = root5;
        root6.right = root7;

        root7.right = root8;

        PreorderTraversal preorderTraversal = new PreorderTraversal();
        preorderTraversal.prePrint(root4);

        /*PrintTreeUtil.show(root4);*/

    }

}
