package com.leetCode.hot100;

public class Solution104 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(2);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(4);
        t1.right.right = new TreeNode(5);
        Solution104 s = new Solution104();
        System.out.println(s.maxDepth(t1));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}