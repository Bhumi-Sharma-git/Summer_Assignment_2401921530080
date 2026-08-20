class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> count= new HashMap<>();
        for(int i=0;i<=nums.length-k;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(nums[j]);
            }
            for(int num:set){
                if(!count.containsKey(num)){
                    count.put(num,1);
                }
                else{
                    count.put(num,count.get(num)+1);
                }
            }
        }
        
            int ans=-1;
            for(int x:count.keySet()){
                if(count.get(x)==1){
                    ans=Math.max(ans,x);
                }
            }
        return ans;
    }
}