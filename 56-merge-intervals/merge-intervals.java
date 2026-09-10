class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> ans=new ArrayList<>();
        int start=intervals[0][0];
        int end= intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                //overlap
                end=Math.max(end,intervals[i][1]);
            }
//no overlap
else{
    ans.add(new int[] {start,end});
    start=intervals[i][0];
    end=intervals[i][1];
}
        }
//add last interval

ans.add(new int[] {start,end});

        return ans.toArray(new int [ans.size()][]);
    }
}