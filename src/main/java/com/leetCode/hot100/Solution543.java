package com.leetCode.hot100;

public class Solution543 {
    int max = 0;
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(4);
        t.left.left.right = new TreeNode(5);
        System.out.println(new Solution543().dfs(t));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = root.left == null ? 0 : dfs(root.left);
        int right = root.right == null ? 0 : dfs(root.right);
        max = Math.max(max,left+right);
        return Math.max(left, right) + 1;
    }

}
