class Solution {
    public int maxProduct(int[] nums) {
        int largest=-1;
        int slargest=-1;
        for(int i=0;i<nums.length;i++){
            if(largest<nums[i]){
                 slargest=largest;
                largest=nums[i];
               
            }
            else if(nums[i]<=largest && nums[i]>slargest){
                slargest=nums[i];
               
            }
        }
        return (largest-1) * (slargest-1);
    }
}