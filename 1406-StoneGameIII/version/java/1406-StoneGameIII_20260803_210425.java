// Last updated: 8/3/2026, 9:04:25 PM
1class Solution {
2    static final String[] s = { "Bob", "Tie", "Alice" };
3
4    public String stoneGameIII(int[] A) {
5        int n = A.length;
6        int[] dp = { 0, 0, 0, 0 };
7
8        for (int i = n - 1; i >= 0; i--) {
9            dp[i & 3] = Integer.MIN_VALUE;
10            int sum = 0;
11
12            for (int j = 1; j <= 3 && i + j <= n; j++) {
13                sum += A[i + j - 1];
14                dp[i & 3] = Math.max(dp[i & 3], sum - dp[(i + j) & 3]);
15            }
16        }
17
18        return s[Integer.signum(dp[0]) + 1];
19    }
20}