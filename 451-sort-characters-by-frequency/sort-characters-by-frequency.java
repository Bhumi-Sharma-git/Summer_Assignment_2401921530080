class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(char ch:s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        List<Character> list= new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
        StringBuilder ans= new StringBuilder();
        for(char ch:list){
            int freq= map.get(ch);
            while(freq>0){
                ans.append(ch);
                freq--;
            }
        }
        return ans.toString();


    }
}