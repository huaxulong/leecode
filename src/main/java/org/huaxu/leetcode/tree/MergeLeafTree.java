package org.huaxu.leetcode.tree;

import org.huaxu.common.TreeNode;
import org.huaxu.util.PrintTreeUtil;

/**
 * @Author DongxuHua
 * @Date: 2022/9/8 5:34 下午
 * @Project: leecode-demo
 * @PakageName: org.huaxu.leetcode.tree
 * 已知所有的 叶子节点， 求 TreeNode。
 * 这里其实 就是 中序遍历的 一个变种。
 */
public class MergeLeafTree {

    public TreeNode mergeLeafTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        mergeLeafTree(root.left);

        mergeLeafTree(root.right);

        if (root.left != null && root.left.val != 0 && root.right != null && root.right.val != 0) {
            root.val = root.left.val + root.right.val;
        } else if (root.left != null && root.left.val != 0 && root.right == null) {
            root.val = root.left.val;
        } else if (root.right != null && root.right.val != 0 && root.left == null) {
            root.val = root.right.val;
        }

        return root;
    }


    public static void main(String[] args) {
        TreeNode root4 = new TreeNode();
        TreeNode root2 = new TreeNode();
        TreeNode root6 = new TreeNode();

        TreeNode root1 = new TreeNode(1);
        TreeNode root3 = new TreeNode(3);

        TreeNode root5 = new TreeNode(5);
        TreeNode root7 = new TreeNode();

        TreeNode root8 = new TreeNode(8);

        root4.left = root2;
        root4.right = root6;

        root2.left = root1;
        root2.right = root3;

        root6.left = root5;
        root6.right = root7;

        root7.right = root8;

        MergeLeafTree mergeLeafTree = new MergeLeafTree();
        TreeNode treeNode = mergeLeafTree.mergeLeafTree(root4);

        PrintTreeUtil.show(treeNode);
    }


}
