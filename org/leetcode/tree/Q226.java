package org.leetcode.tree;

import algorithm.tree.TreeNode;

import java.util.LinkedList;

/**
 * Created by lightman_mac on 2018/7/14.
 * 翻转二叉树
 * https://leetcode-cn.com/problems/invert-binary-tree/description/
 */
public class Q226 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */

    public TreeNode invertTree(TreeNode root) {
        if (root == null || root.left == null && root.right == null) return root;
        //help(root);
        // return root;

        return iterate(root);
    }

    private void help(TreeNode root) {
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
    }

    private TreeNode iterate(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }

        return root;
    }
}
