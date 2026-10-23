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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        List<Integer> path=new ArrayList<>();
        solve(root, targetSum,path,res);
        return res;
    }
    public void solve(TreeNode root, int targetSum, List<Integer> path,List<List<Integer>> res){
        if(root==null) return;
        path.add(root.val);
        targetSum-=root.val;
        if(root.left==null &&root.right==null && targetSum==0){
            res.add(new ArrayList<>(path));
        }
        solve(root.left,targetSum,path,res);
        solve(root.right,targetSum,path,res);
path.remove(path.size()-1);
    }
}