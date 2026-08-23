class Solution {
    public int maxVowels(String s, int k) {
         int count = 0;
    int ans = 0;

    for (int i = 0; i < s.length(); i++) {

        // Add current character
        if (isVowel(s.charAt(i))) {
            count++;
        }

        // Remove character outside the window
        if (i >= k && isVowel(s.charAt(i - k))) {
            count--;
        }

        // Window has size k
        if (i >= k - 1) {
            ans = Math.max(ans, count);
        }
    }

    return ans;
}

private boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' ||
           ch == 'o' || ch == 'u';
}
    
}