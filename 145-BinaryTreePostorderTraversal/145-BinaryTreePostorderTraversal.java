// Last updated: 7/21/2026, 5:01:37 PM
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        poastorder(root , ans);
        return ans;
    }


    public void poastorder(TreeNode root,List<Integer> ans){
        if(root == null) return;
        
        poastorder(root.left , ans);
        poastorder(root.right , ans);
        ans.add(root.val);
    }
}
