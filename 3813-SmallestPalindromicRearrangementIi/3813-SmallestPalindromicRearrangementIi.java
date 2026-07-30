// Last updated: 7/30/2026, 6:59:18 AM
class Solution {

    // Compute nCr, but stop if the result exceeds k.
    long nCr(int n, int r, int k) {
        long res = 1;

        // Use the smaller value of r for fewer iterations.
        r = Math.min(r, n - r);

        for (int i = 1; i <= r; i++) {
            res = res * (n - i + 1) / i;

            // No need for the exact value if it is already greater than k.
            if (res > k) {
                return k + 1;
            }
        }

        return res;
    }

    // Count the number of distinct permutations possible.
    long ways(int n, int[] freq, int k) {
        long total = 1;

        for (int i = 0; i < 26; i++) {
            total *= nCr(n, freq[i], k);

            // Again, cap the value at k + 1.
            if (total > k) {
                return k + 1;
            }

            n -= freq[i];
        }

        return total;
    }

    public String smallestPalindrome(String s, int k) {

        int n = s.length();
        int halfLength = n / 2;

        int[] freq = new int[26];

        // Count frequencies.
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        char[] ans = new char[n];

        // Keep the middle character (if the length is odd)
        // and reduce every frequency to half.
        for (int i = 0; i < 26; i++) {

            if ((freq[i] & 1) == 1) {
                ans[n / 2] = (char) ('a' + i);
            }

            freq[i] /= 2;
        }

        // Check whether at least k palindromes exist.
        long totalWays = ways(halfLength, freq, k);

        if (totalWays < k) {
            return "";
        }

        // Build the left half greedily.
        for (int pos = 0; pos < halfLength; pos++) {

            for (int ch = 0; ch < 26; ch++) {

                if (freq[ch] == 0) {
                    continue;
                }

                // Try placing this character.
                freq[ch]--;

                long possible = ways(halfLength - pos - 1, freq, k);

                if (possible >= k) {

                    // This character belongs here.
                    ans[pos] = (char) ('a' + ch);
                    break;

                } else {

                    // Skip all palindromes starting with this prefix.
                    k -= possible;

                    // Undo the choice.
                    freq[ch]++;
                }
            }
        }

        // Mirror the left half to the right half.
        for (int i = 0; i < halfLength; i++) {
            ans[n - 1 - i] = ans[i];
        }

        return new String(ans);
    }
}