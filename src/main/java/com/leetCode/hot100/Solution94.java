package com.leetCode.hot100;

import java.util.ArrayList;
import java.util.List;

public class Solution94 {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(2);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(4);
        Solution94 s = new Solution94();
        List<Integer> l = s.inorderTraversal(t1);
        for (Integer integer:l){
            System.out.println(integer);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        adds(root, list);
        return list;
    }

    public void adds(TreeNode treeNode, List<Integer> list) {
        if (treeNode == null || list == null) {
            return;
        }
        adds(treeNode.left, list);
        list.add(treeNode.val);
        adds(treeNode.right, list);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}