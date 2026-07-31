class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1); //rem is 0 before array starts
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(map.containsKey(rem)){
                //subarray length shoud be at least two
                if(i-map.get(rem)>=2){
                    return true;
                }
            }
                else{
                    //store only the first occurence
                    map.put(rem,i);
                
            }
        }
return false;
    }
}