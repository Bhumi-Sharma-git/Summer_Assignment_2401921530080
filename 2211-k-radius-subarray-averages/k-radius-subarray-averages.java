class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int[] ans= new int[n];
        for(int i=0;i<n;i++){
            ans[i]=-1;
        }
        int window=2*k+1;
        if(window>n) return ans;
        long[] prefix=new long[n+1];
        for(int i=0;i<n;i++){
prefix[i+1]=prefix[i]+nums[i];
        }
        //find average
        for(int i=k;i<n-k;i++){
            int left=i-k;
            int right=i+k;
            long sum=prefix[right+1]-prefix[left];
            ans[i]=(int)(sum/window);


        }
        return ans;
    }
}