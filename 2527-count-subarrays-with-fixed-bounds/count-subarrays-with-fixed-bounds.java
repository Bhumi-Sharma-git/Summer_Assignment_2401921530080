class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int mini=-1;
        int maxi=-1;
        long count=0;
        int leftBoundary=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK|| nums[i]>maxK){
                leftBoundary=i;
            }
            if(nums[i]==minK){
                mini=i;
            }
            if(nums[i]==maxK){
                maxi=i;
            }
            int smaller=Math.min(mini,maxi);
            if((smaller-leftBoundary)>0){
                count+=smaller-leftBoundary;

            }
        }
        return count;
    }
}