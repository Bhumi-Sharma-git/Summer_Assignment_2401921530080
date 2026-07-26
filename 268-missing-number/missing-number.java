class Solution {
    public int missingNumber(int[] nums) {
        int XOR1=0;
        for(int i=1;i<=nums.length;i++){
            XOR1=XOR1^i;
        }
        for(int i=0;i<nums.length;i++){
            XOR1=XOR1^nums[i];
        }
        return XOR1;
    }
}