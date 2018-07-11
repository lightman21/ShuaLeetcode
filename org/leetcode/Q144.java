package org.leetcode;

import algorithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lightman_mac on 2018/7/11.
 * <p>
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/description/
 * <p>
 * 给定一个二叉树,返回它的 前序 遍历
 */
public class Q144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<TreeNode> stack = new Stack();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode tree = stack.pop();
            list.add(tree.val);
            if (tree.right != null) {
                stack.push(tree.right);
            }
            if (tree.left != null) {
                stack.push(tree.left);
            }
        }

        return list;
    }
}
