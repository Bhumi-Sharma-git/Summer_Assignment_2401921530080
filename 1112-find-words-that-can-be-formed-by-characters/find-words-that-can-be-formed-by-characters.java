class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq= new int[26];
        for(char ch:chars.toCharArray()){
            freq[ch-'a']++;
        }
        int ans=0;
        for(String word:words){
            int[] temp=new int[26];
            boolean possible=true;
            for(char ch:word.toCharArray()){
                temp[ch-'a']++;
                  if(temp[ch-'a']>freq[ch-'a']){
                    possible=false;
                    break;

                  }
            }
            if(possible==true){
                ans+=word.length();
            }
          
        }
        return ans;
    }
}