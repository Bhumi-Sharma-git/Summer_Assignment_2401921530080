class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,-1);
        int count=0;
        int maxLen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count--;
            }
            if(map.containsKey(count)){
                int len=i-map.get(count);
                maxLen=Math.max(len,maxLen);
            }
            else{
                map.put(count,i);
            }
        }
        return maxLen;
    }
}