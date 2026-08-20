class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n];

        //Product of elements on the left
        int left=1;
        for(int i=0;i<n;i++){
            ans[i]=left;
            left=left*nums[i];
        } 
        //product of elements on the right
        int right=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*right;
            right=right*nums[i];
        }
        return ans;

    }
}