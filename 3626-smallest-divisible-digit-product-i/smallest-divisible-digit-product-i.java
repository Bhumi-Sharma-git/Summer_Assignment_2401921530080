class Solution {
    public int smallestNumber(int n, int t) {
        int product=1;
        int num=n;
        while(n>0){
            int digit=n%10;
             product*=digit;
             n/=10;
        }
        if(product%t == 0){
            return num;
        }
        else  num++;
        return smallestNumber(num,t);
    }
}