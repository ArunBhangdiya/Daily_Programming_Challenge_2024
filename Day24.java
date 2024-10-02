import java.util.*;
/*
Lowest Common Ancestor (LCA) in a Binary Tree

You are given a binary tree and two distinct nodes within the tree. Your task is to find the lowest common ancestor (LCA) of these two nodes. The LCA of two nodes p and q is defined as the lowest node in the tree that has both p and q as descendants (where we allow a node to be a descendant of itself).

Input:
A binary tree represented as a series of nodes where each node has references to its left and right child.
Two distinct nodes p and q from the tree.

Output:
Return the node that is the lowest common ancestor (LCA) of p and q.
Examples:
Example 1
Input: root = [3, 5, 1, 6, 2, 0, 8, null, null, 7, 4], p = 5, q = 1
Output: 3

Explanation: 
The lowest common ancestor of nodes 5 and 1 is 3, because 3 is the lowest node that has both 5 and 1 as descendants.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Day24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nodes = new int[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = sc.nextInt();
        }
        TreeNode root = createTree(nodes, 0);
        int pVal = sc.nextInt();
        int qVal = sc.nextInt();
        TreeNode p = findNode(root, pVal);
        TreeNode q = findNode(root, qVal);
        System.out.println(lCA(root, p, q).val);
        sc.close();
    }

    public static TreeNode createTree(int[] nodes, int index) {
        if (index >= nodes.length || nodes[index] == -1) {
            return null;
        }

        TreeNode node = new TreeNode(nodes[index]);
        node.left = createTree(nodes, 2 * index + 1);
        node.right = createTree(nodes, 2 * index + 2);
        return node;
    }

    public static TreeNode findNode(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        TreeNode left = findNode(root.left, val);
        if (left != null) {
            return left;
        }
        return findNode(root.right, val);
    }

    public static TreeNode lCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lCA(root.left, p, q);
        TreeNode right = lCA(root.right, p, q);

        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        } else {
            return root;
        }
    }
}
