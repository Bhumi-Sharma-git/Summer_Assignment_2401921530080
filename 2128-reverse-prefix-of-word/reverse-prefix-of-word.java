class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=-1;
        for(int i=0;i<word.length();i++){
        if(ch==word.charAt(i)){
            idx=i;
            break;
        }
        }
        if(idx==-1) return word;
        char[] arr= word.toCharArray();
        reverse(0,idx, arr);
        return new String(arr);
    }
    public void reverse(int start, int end, char[] arr){
        if(start==end) return;
       while(start<end){
        char temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
       }
        
    }
}