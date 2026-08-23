class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            HashSet<Character> set1=new HashSet<>();
            for(char c:words[i].toCharArray()){
                set1.add(c);
            }
            for(int j=i+1;j<words.length;j++){
                HashSet<Character> set2= new HashSet<>();
                for(char ch:words[j].toCharArray()){
                    set2.add(ch);
                }
                if(set1.equals(set2)){
                    count++;
                }


            }
        }
        return count;
    }
}