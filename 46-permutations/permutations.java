class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        solve(nums,0,ans);
        return ans;
    }
    private void solve(int[] nums, int idx,  List<List<Integer>> ans){
        if(idx==nums.length){
            List<Integer> temp= new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            ans.add(temp);
        }
        for(int i=idx;i<nums.length;i++){
        swap(nums,idx,i);
         solve(nums, idx+1,ans);
         swap(nums,idx,i); //backtrack
        }
    }
    private void swap(int[] nums, int start, int end){
        while(start<=end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
        }
    }
}