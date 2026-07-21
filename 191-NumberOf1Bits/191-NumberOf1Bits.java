// Last updated: 7/21/2026, 5:01:31 PM
class Solution {
    public int hammingWeight(int n) {
        String str = Integer.toBinaryString(n);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '1') {
                count++;
            }
        }

        return count;
    }
}