class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> ans= new ArrayList<>();
       solve(nums,0,ans); 
       return ans;
    }

     List<Integer> temp= new ArrayList<>();
    private void solve(int[] nums, int idx, List<List<Integer>> ans){
        if(idx==nums.length){
           ans.add(new ArrayList<>(temp));
           return;
        }
        //pick
        temp.add(nums[idx]);
        solve(nums,idx+1,ans);
        int i=idx;
        int n=nums.length;
         temp.remove(temp.size()-1);   //backtrack
        while(i+1<n && nums[i]==nums[i+1]){
            i++;
        }
        //not pick
       
        solve(nums,i+1,ans);
    }
}
