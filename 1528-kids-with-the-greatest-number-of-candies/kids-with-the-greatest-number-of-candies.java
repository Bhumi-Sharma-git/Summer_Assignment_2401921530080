class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list= new ArrayList<>();
        int max=0;
        for(int x: candies){
max=Math.max(max,x);
        }
        for(int num:candies){
            num+=extraCandies;
            if(num>=max){
                list.add(true);
            }
            else list.add(false);
        }
        return list;
    }
}