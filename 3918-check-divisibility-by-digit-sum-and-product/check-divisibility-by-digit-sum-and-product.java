class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int digitSum=0;
        int product=1;
        while(n>0){
            digitSum+=n%10;
            product*=n%10;
            n/=10;
            
        }
        int total=digitSum+product;
if(original%total == 0){
    return true;
}
return false;
    }
}