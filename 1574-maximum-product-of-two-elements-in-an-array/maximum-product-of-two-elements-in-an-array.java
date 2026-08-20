class Solution {
    public int maxProduct(int[] nums) {
        int largest=-1;
        int slargest=-1;
      for(int num:nums){
        if(num>largest){
            slargest=largest;
            largest=num;
        }
        else if(num>slargest){
            slargest=num;
        }
      }
        return (largest-1) * (slargest-1);
    }
}