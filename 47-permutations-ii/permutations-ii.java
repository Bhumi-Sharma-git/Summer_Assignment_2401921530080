class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        solve(nums,0,ans);
        return ans;
    }
    private void solve(int[] nums, int idx, List<List<Integer>> ans){
        if(idx==nums.length){
            List<Integer> temp= new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            ans.add(temp);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=idx;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            swap(nums,idx,i);
            solve(nums,idx+1,ans);
            swap(nums,idx,i); //backtrack

        }
    }
        public void swap(int[] nums, int start,int end){
           
int temp= nums[start];
nums[start]=nums[end];
nums[end]=temp;

            
        }
    
}