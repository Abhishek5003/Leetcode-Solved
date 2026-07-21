// Last updated: 7/21/2026, 5:01:22 PM
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
    public TreeNode invertTree(TreeNode root) {
        preorder(root);
        return root;
    }

    public void preorder(TreeNode temp){
        if(temp != null){
            swap(temp);
            preorder(temp.left);
            preorder(temp.right);
        }
    }

    public void swap(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}