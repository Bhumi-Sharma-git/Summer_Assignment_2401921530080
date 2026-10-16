class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st= new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && c==st.peek()){
                st.pop();
            }
            else st.push(c);
        }
        StringBuilder sb=new StringBuilder();
        while(st.size()!=0){
sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}