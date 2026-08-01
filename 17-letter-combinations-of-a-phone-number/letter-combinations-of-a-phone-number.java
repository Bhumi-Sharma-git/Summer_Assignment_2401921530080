class Solution {
       static String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
     
        List<String> ans= new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
       possibleWords(digits,"",ans);
       return ans;
    }
void possibleWords(String digits,String current, List<String> ans){
        if(digits.length()==0){
            ans.add(current);
            return;
        }
        String key=keypad[digits.charAt(0)-'0'];
        for(int i=0;i<key.length();i++){
            possibleWords(digits.substring(1),current+key.charAt(i),ans);
        }

    }
}