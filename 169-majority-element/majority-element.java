class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            int count= map.get(nums[i]);
            map.put(nums[i], count+1);
        }
        else{
            map.put(nums[i],1);
        }
        if(map.get(nums[i])>n/2){
            return nums[i];
        }
       }
       return -1;

    }
}