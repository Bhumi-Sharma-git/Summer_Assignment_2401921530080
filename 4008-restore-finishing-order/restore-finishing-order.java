class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
       HashSet<Integer> set=new HashSet<>();
       for(int x:friends){
        set.add(x);
       } 
       int[] ans=new int[friends.length];
       int j=0;
       for(int num:order){
        if(set.contains(num)){
            ans[j]=num;
            j++;
        }
       }
       return ans;
    }
}