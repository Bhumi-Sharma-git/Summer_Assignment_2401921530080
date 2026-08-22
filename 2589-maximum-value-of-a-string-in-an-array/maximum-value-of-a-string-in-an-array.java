class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        int value;
        for(String s:strs){
            Boolean digit=true;
            for(char ch:s.toCharArray()){
                if(!Character.isDigit(ch)){
                    digit=false;
                    break;
                }
            }
            if(digit==true){
                value=Integer.parseInt(s);
            }
            else{
                value=s.length();
            }
            max=Math.max(max,value);
        }
        return max;
    }
}