package org.leetcode.tree;

import algorithm.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by lightman_mac on 2018/7/11.
 * <p>
 * https://leetcode-cn.com/problems/binary-tree-postorder-traversal/description/
 * <p>
 * 给定一个二叉树,返回它的 后序 遍历
 */
public class Q145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        if (root == null) return list;

        Stack<TreeNode> input = new Stack();
        Stack<TreeNode> output = new Stack();
        input.push(root);

        while (!input.empty()) {
            TreeNode out = input.pop();
            output.push(out);

            if (out.left != null) {
                input.push(out.left);
            }

            if (out.right != null) {
                input.push(out.right);
            }
        }

        while (!output.empty()) {
            list.add(output.pop().val);
        }

        return list;
    }
}
