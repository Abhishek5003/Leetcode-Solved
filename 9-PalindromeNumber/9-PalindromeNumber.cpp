// Last updated: 7/21/2026, 5:02:34 PM
class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0) return false; // Negative numbers are not palindromes

        int original = x;
        long long rev = 0;

        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }

        return original == rev;
    }
};
