class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        long ans=0;
        long sum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            if(!map.containsKey(nums[right])){
                map.put(nums[right] ,1);
            }
            else{
            map.put(nums[right], map.get(nums[right])+1);
            }
            while((right-left+1)>k){
               map.put(nums[left], map.get(nums[left])-1);
                sum-=nums[left];
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            if((right-left+1)==k && map.size()==k){
                ans=Math.max(ans,sum);

            }
        }
        return ans;
    }
}