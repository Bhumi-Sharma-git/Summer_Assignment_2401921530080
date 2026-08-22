class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num,map.get(num)+1);
            }
        }
        int n=nums.length;
        Integer[] ans= new Integer[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
    }
    Arrays.sort(ans,(a,b)->{
        int freqA=map.get(a);
        int freqB=map.get(b);
        if(freqA==freqB){
            return b-a;  //largest no. first
        }
        return freqA-freqB;  //smallest freq first
    });
    for(int i=0;i<n;i++){
        nums[i]=ans[i];
    }
    return nums;

    }
}