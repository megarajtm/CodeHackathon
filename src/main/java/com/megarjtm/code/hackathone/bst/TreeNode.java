package com.megarjtm.code.hackathone.bst;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public void setLeft(final TreeNode left) {
        this.left = left;
    }

    public void setRight(final TreeNode right) {
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}
