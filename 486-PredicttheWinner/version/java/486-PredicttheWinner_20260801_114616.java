// Last updated: 8/1/2026, 11:46:16 AM
1class Solution {
2
3    Integer[][] dp;
4
5    public boolean predictTheWinner(int[] nums) {
6        int n = nums.length;
7        dp = new Integer[n][n];
8
9        return solve(nums, 0, n - 1) >= 0;
10    }
11
12    private int solve(int[] nums, int left, int right) {
13
14        if (left == right) {
15            return nums[left];
16        }
17
18        if (dp[left][right] != null) {
19            return dp[left][right];
20        }
21
22        int pickLeft = nums[left] - solve(nums, left + 1, right);
23        int pickRight = nums[right] - solve(nums, left, right - 1);
24
25        return dp[left][right] = Math.max(pickLeft, pickRight);
26    }
27}