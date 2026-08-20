class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else map.put(num,1);
        }

        int ans=-1;
        for(int num:map.keySet()){
            if(map.get(num)==num){
                ans=Math.max(ans,num);
            }
        }
        return ans;
    }
}