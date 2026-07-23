// Last updated: 7/23/2026, 8:08:40 AM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int n = nums.length;
4        if(n <= 2) return n;
5
6        int ans = 1;
7        while(ans <= n) 
8            ans <<= 1;
9        
10        return ans;
11    }
12}