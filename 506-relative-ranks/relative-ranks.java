class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] ans= new String[n];

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(score[i],i);
        }
        //Sort scores in descending order
        Integer[] arr= new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=score[i];
        }
        Arrays.sort(arr,Collections.reverseOrder());
        //Assign ranks

        for(int i=0;i<n;i++){
            int originalIndex=map.get(arr[i]);
            if(i==0){
                ans[originalIndex]="Gold Medal";
            }
            else if(i==1){
                ans[originalIndex]="Silver Medal";
            }
            else if(i==2){
                ans[originalIndex]="Bronze Medal";
            }
            else
            ans[originalIndex]=String.valueOf(i+1);
        }
        return ans;

    }
}