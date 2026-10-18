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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int leftDepth=height(root.left);
        int rightDepth=height(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int leftHt=height(root.left);
        int rightHt=height(root.right);
        return Math.max(leftHt,rightHt)+1;
    }
}