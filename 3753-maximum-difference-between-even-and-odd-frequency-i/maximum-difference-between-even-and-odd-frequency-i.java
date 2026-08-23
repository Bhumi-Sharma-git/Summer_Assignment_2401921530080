class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;

        for (int freq : map.values()) {
            if (freq % 2 == 1) {
                maxOdd = Math.max(maxOdd, freq);
            } else {
                minEven = Math.min(minEven, freq);
            }
        }

        return maxOdd - minEven; 
    }
}