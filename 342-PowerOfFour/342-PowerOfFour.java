// Last updated: 7/21/2026, 5:01:02 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        while (n % 4 == 0) n = n / 4;
        if (n == 1) return true;
        return false;
    }
}