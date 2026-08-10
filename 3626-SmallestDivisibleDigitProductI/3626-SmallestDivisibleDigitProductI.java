// Last updated: 8/10/2026, 8:57:52 PM
class Solution {
    public int smallestNumber(int n, int t) {
        int i = n;

        while (true) {
            int mul = 1;
            int x = i;

            while (x > 0) {
                mul *= (x % 10);
                x /= 10;
            }

            if (mul % t == 0) {
                return i;
            }

            i++;
        }
    }
}