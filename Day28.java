import java.util.*;
/*
Check if a Binary Tree is Symmetric

You are given the root of a binary tree. Your task is to determine whether the tree is symmetric. A binary tree is symmetric if the left and right subtrees are mirror images of each other.

Input:
The root of the binary tree.

Output:
Return true if the binary tree is symmetric, otherwise return false.

Examples:
Example 1
Input: [1, 2, 2, 3, 4, 4, 3]
Output: true
Explanation: 

This binary tree is symmetric as the left and right subtrees are mirror images of each other.
 */
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class Day28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeNode root = insertLevelOrder(arr, null, 0);

        System.out.println(isSymmetric(root));
        sc.close();
    }

    static TreeNode insertLevelOrder(int[] arr, TreeNode root, int i) {
        if (i < arr.length) { 
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;

            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    static boolean isMirror(TreeNode left, TreeNode right) {
        if (left==null||right==null) return left==right;
        if (left.val!=right.val) return false;
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }
}
