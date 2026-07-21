// Last updated: 7/21/2026, 5:01:03 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        if (n == 1) {
            return true;
        }

        return false;
    }
}