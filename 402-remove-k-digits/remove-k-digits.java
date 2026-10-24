class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        int n=num.length();
        for(int i=0;i<n;i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
            while(k>0&& !st.isEmpty()){
                st.pop();
                k--;
            }
        
    if(st.isEmpty()) return "0";
    String result="";
    while(!st.isEmpty()){
        result=st.pop()+result;
    }
    int i=0;
    while(i<result.length() && result.charAt(i)=='0'){
        i++;
    }
    result=result.substring(i);
    if(result=="") return"0";
    return result;
}
}