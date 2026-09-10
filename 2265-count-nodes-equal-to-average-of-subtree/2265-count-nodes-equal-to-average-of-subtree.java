/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int averageOfSubtree(TreeNode root) {
        if (root == null)
            return 0;
        int count = 0;

        count += averageOfSubtree(root.left);
        count += averageOfSubtree(root.right);

        int sum = sum(root);
        int size = size(root);
        if (root.val == sum / size)
            count++;

        return count;
    }

    public int sum(TreeNode root) {
        if (root == null)
            return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public int size(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);
    }
}