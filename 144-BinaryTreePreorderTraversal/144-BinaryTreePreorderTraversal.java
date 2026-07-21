// Last updated: 7/21/2026, 5:01:39 PM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        priorder(root , ans);
        return ans;
    }


    public void priorder(TreeNode root,List<Integer> ans){
        if(root == null) return;
        
        ans.add(root.val);
        priorder(root.left , ans);
        priorder(root.right , ans);
    }
}
