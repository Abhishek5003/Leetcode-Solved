// Last updated: 7/23/2026, 10:33:50 AM
1class Solution {
2    public int pivotInteger(int n) {
3        int total = n * (n + 1) / 2;
4        int leftSum = 0;
5
6        for (int x = 1; x <= n; x++) {
7            leftSum += x;
8            int rightSum = total - leftSum + x;
9
10            if (leftSum == rightSum) return x;
11            
12        }
13
14        return -1; 
15    }
16}