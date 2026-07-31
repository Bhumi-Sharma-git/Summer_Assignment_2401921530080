class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        //prefix sum 0 occurs once before the array 
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            //we need an earlier prefix sum=sum-k
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
//store current prefix sum
if(map.containsKey(sum)){
    map.put(sum,map.get(sum)+1);
}
else{
    map.put(sum,1);
}
        }
        return count;

    }
}