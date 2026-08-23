class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        if (map.size() <= k) {
            return 0;
        }

        List<Integer> freq = new ArrayList<>();

        for (int f : map.values()) {
            freq.add(f);
        }

        Collections.sort(freq);

        int ans = 0;
        int remove = map.size() - k;

        for (int i = 0; i < remove; i++) {
            ans += freq.get(i);
        }

        return ans; 
    }
}