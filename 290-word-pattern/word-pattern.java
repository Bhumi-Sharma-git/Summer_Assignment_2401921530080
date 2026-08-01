class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> mp1=new HashMap<>();
        HashMap<String,Boolean> mp2= new HashMap<>();
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch1=pattern.charAt(i);
            String s1=words[i];
            if(mp1.containsKey(ch1)){
                if(!mp1.get(ch1).equals (s1)){
                    return false;
                }
            }
            else{
                if(mp2.containsKey(s1)){
                    return false;
                }
                else{
                    mp1.put(ch1,s1);
                    mp2.put(s1,true);
                }
            }
        }
        return true;

    }
}