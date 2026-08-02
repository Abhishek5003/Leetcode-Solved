// Last updated: 8/2/2026, 7:57:24 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int maxfreq = 0;
4        int currfreq = 0;
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] == 1) currfreq++;
7            if(nums[i] == 0) currfreq = 0;
8            maxfreq = Math.max(maxfreq,currfreq);
9        }
10        return maxfreq;
11    }
12}