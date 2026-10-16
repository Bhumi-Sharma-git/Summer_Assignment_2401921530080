class Solution {
    public String clearDigits(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && isDigit(ch)==true && !isDigit(st.peek()) ){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb= new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());

        }
        sb.reverse();
        return sb.toString();
    }
    public boolean isDigit(char ch){
        int ascii=(int)ch;
        if(ascii>=48 && ascii<=57) return true;
        else return false;
    }
}