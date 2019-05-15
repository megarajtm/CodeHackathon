package com.megarajtm.code.hackathon.bst;

import java.util.HashSet;
import java.util.Set;

public class SumBwNodes {

    static void rangeSumBST(final TreeNode root, int L, int R, Set<Integer> count) {
        if (root == null) {
            return;
        }
        rangeSumBST(root.left, L, R, count);
        if (root.val >= L && root.val <= R) {
            count.add(root.val);
        }
        rangeSumBST(root.right, L, R, count);
    }

    public static void main(String[] args) {
        final TreeNode root = new TreeNode(10);
        final TreeNode l1 = new TreeNode(5);
        final TreeNode r1 = new TreeNode(15);
        final TreeNode l21 = new TreeNode(3);
        final TreeNode r21 = new TreeNode(7);
        final TreeNode l22 = new TreeNode(13);
        final TreeNode r22 = new TreeNode(18);
        final TreeNode l31 = new TreeNode(1);
        final TreeNode l32 = new TreeNode(6);
        root.setLeft(l1);
        root.setRight(r1);
        l1.setLeft(l21);
        l1.setRight(r21);
        r21.setLeft(l22);
        r1.setRight(r22);
        l21.setLeft(l31);
        r21.setLeft(l32);
        final Set<Integer> nums = new HashSet<Integer>();
        rangeSumBST(root, 6, 10, nums);
        int count = 0;
        for (int num : nums) {
            count += num;
        }
        System.out.println(count);
    }

}
