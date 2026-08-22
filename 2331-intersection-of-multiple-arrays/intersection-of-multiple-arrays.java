class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int[] arr:nums){
            for(int a:arr){
                if(!map.containsKey(a)){
                    map.put(a,1);
                }
                else{
                    map.put(a,map.get(a)+1);
                }
            }
        }
        List<Integer> ans= new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==nums.length){
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}