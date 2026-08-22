class Solution {
    public int minimumPushes(String word) {
        int[] freq= new int[26];
        for(char w:word.toCharArray()){
            freq[w-'a']++;
        }
        Arrays.sort(freq);
        int pos=0;
        int pushes=0;
        for(int i=25;i>=0;i--){
            if(freq[i]==0){
                break;
            }
           pushes+= freq[i] * ((pos/8) +1);
            pos++;
        }
        return pushes;
    }
}