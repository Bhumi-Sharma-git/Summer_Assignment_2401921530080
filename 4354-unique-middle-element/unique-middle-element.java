class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
         int middle = nums.length / 2;
        int count = 0;

        for (int num : nums) {
            if (num == nums[middle]) {
                count++;
            }
        }

        return count == 1;
    }
}