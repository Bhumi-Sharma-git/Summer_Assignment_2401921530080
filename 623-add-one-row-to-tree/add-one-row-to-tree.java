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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode node= new TreeNode(val);
            node.left=root;
            return node;
        }
        if(root==null) return null;
        if(depth==2){
            TreeNode left=new TreeNode(val);
            TreeNode right=new TreeNode(val);
            left.left=root.left;
            right.right=root.right;
            root.left=left;
            root.right=right;
            return root;
        }
        root.left=addOneRow(root.left,val,depth-1);
        root.right=addOneRow(root.right,val,depth-1);
        return root;
    }
}