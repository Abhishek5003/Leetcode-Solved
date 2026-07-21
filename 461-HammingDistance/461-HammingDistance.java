// Last updated: 7/21/2026, 5:00:50 PM
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}