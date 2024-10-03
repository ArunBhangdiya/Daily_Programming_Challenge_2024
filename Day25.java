import java.util.*;
/*
Check if a Binary Tree is a Binary Search Tree (BST)

You are given the root of a binary tree. Your task is to determine whether the tree is a valid Binary Search Tree (BST). A binary search tree is defined as a tree where:
Every node’s left subtree contains only nodes with values less than the node’s value.
Every node’s right subtree contains only nodes with values greater than the node’s value.
Both the left and right subtrees must also be binary search trees.

Input:
A binary tree represented by its root node.

Output:
Return true if the binary tree is a valid BST, otherwise return false.
Examples:
Example 1
Input: root = [2, 1, 3]
Output: true
Explanation: 

The tree satisfies the BST property
Node 1 (left of 2) is less than 2.
Node 3 (right of 2) is greater than 2.

 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Day25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nodes = new int[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = sc.nextInt();
        }
        TreeNode root = createTree(nodes, 0);
        System.out.println(isValidBST(root));
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

    public static boolean isBST(TreeNode root, long p, long q) {
        if (root == null) return true;

        if (root.val >= q || root.val <= p) return false;
        return isBST(root.left,p,root.val) && isBST(root.right,root.val,q);
    }

    public static boolean isValidBST(TreeNode root){
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
