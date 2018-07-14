package org.leetcode.tree;

import algorithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lightman_mac on 2018/7/11.
 * <p>
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/description/
 * <p>
 * 给定一个二叉树,返回它的中序 遍历
 */
public class Q94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (!stack.empty() || cur != null) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }

        return list;
    }

}
