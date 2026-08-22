class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        solve(nums,0,ans);
        return ans;

    }
     List<Integer> curr= new ArrayList<>();
    private void solve(int[] nums, int idx, List<List<Integer>> ans){
       
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        //pick/take
        curr.add(nums[idx]);
        solve(nums,idx+1,ans);
        curr.remove(curr.size()-1);  //backtrack
        //dont pick/dont take
        solve(nums,idx+1,ans);

    }
}