class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        int ans = 0;

        // Check frequency
        for (int num : map.keySet()) {
            int freq = map.get(num);

            if (freq % k == 0) {
                ans += num * freq;
            }
        }

        return ans;

    }
}