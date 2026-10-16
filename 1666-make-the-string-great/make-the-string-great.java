class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && Math.abs(st.peek()-ch)==32){
                st.pop();
            }
            else st.push(ch);
        }
        String result="";
        while(!st.isEmpty()){
            result=st.pop()+result;
        }
        return result;
    }
}