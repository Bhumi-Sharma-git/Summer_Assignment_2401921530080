class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum= Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<k;i++){
            currSum+=nums[i];
            
        }
        maxSum=currSum;
            for(int i=k;i<nums.length;i++){
                currSum=currSum+nums[i]-nums[i-k];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
return (double)maxSum/k;

    }
}