class Solution {
    public int maxSubArray(int[] nums) {
        int maxi= Integer.MIN_VALUE;
        int sum=0,n=nums.length;
        int start=-1;
        for(int i=0;i<n;i++){
            if(sum==0) start=i;
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
                int ansStart=start,ansEnd=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}