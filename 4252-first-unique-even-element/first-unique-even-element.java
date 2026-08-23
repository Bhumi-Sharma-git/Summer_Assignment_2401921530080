class Solution {
    public int firstUniqueEven(int[] nums) {
      HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        // Find first unique even number
        for (int num : nums) {
            if (num % 2 == 0 && map.get(num) == 1) {
                return num;
            }
        }

        return -1;   
    }
}