// Last updated: 8/10/2026, 8:57:55 PM
class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) 
            freq[c - 'a']++;
        
        Arrays.sort(freq);
        int ans = 0;
        for (int i = 25; i >= 0 && freq[i] > 0; i--) 
            ans += freq[i] * ((25 - i) / 8 + 1);
        
        return ans;
    }
}