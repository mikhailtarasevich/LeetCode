package com.mt.leetcode;

public class InvertBinaryTree {

    public static void main(String[] args) {

    }

    public static TreeNode invertTree(TreeNode root) {

        if(root != null) {
            if(root.left != null) invertTree(root.left);
            if(root.right != null) invertTree(root.right);

            TreeNode tempLeft = root.left;
            root.left = root.right;
            root.right = tempLeft;
        }

        return root;
    }

}

/**
 * Definition for a binary tree node.
 */ class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
