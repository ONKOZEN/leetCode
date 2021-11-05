package com.leetCode.hot100.datas;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);


    }
    public static void bfs(TreeNode treeNode){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(treeNode);
        while (!queue.isEmpty()){
            TreeNode treeNode1 = queue.poll();
            if(){

            }
        }

    }
}
class TreeNode{
    TreeNode left;
    TreeNode right;
    Integer value;

    public TreeNode() {
    }

    public TreeNode(Integer value) {
        this.value = value;
    }

    public TreeNode(TreeNode left, TreeNode right, Integer value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }
}