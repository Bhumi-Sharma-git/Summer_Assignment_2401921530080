class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            else{
                map.put(num, map.get(num)+1);
            }
        }
        int x=0;
        for(int num:map.keySet()){
            if(map.get(num)==1){
                x+=num;
            }
        }
        return x;
    }
}