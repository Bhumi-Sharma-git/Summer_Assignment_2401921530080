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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode,Long>> q=new LinkedList<>();
        q.offer(new Pair<>(root,0L));
        int maxWidth=0;
        while(!q.isEmpty()){
            int currSize=q.size();
            long start=q.peek().getValue();
            long end=start;
            for(int i=0;i<currSize;i++){
                Pair<TreeNode,Long> curr=q.poll();
                end=curr.getValue();
                if(curr.getKey().left!=null){
                    q.offer(new Pair<>(curr.getKey().left, curr.getValue()*2+1));
                }
                if(curr.getKey().right!=null){
                    q.offer(new Pair<>(curr.getKey().right, curr.getValue()*2+2));
                }
            }
            maxWidth=Math.max(maxWidth,(int) (end-start+1));
        }
        return maxWidth;
    }
}