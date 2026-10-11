class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        HashMap<Character,Integer> map= new HashMap<>();
        for(char c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int left=0;
        int requiredCount=t.length();
        int minLength=Integer.MAX_VALUE;
        int start=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(map.containsKey(c)){
                if(map.get(c)>0){
                    requiredCount--;
                }
                map.put(c,map.get(c)-1);
            }
            else{
                map.put(c,-1);
            }
            while(requiredCount==0){
                if(right-left+1 < minLength){
                    minLength=right-left+1;
                    start=left;
                }
                char ch=s.charAt(left);
               
                    map.put(ch,map.get(ch)+1);
                    if(map.get(ch)>0){
                        requiredCount++;
                    }
                
                left++;
            }
        }
        if(minLength==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minLength);
    }
}