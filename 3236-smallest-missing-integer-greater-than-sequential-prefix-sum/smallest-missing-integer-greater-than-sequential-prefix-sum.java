class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int i=1;
        int sum=nums[0];
        while(i<n && nums[i]==nums[i-1]+1){
            sum+=nums[i];
            i++;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}