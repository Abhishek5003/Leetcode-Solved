// Last updated: 7/23/2026, 10:08:51 AM
// This is the simple its basically a mathematical problem in which we have to verify that a given array can be cast into a AP if it can be then return true either false.
1class Solution {
2    public boolean canMakeArithmeticProgression(int[] nums) {
3        Arrays.sort(nums);
4        int d = nums[1] - nums[0];
5        for(int i = 1; i < nums.length; i++){
6            if(nums[i] - nums[i-1] != d){
7                return false;
8            }
9        }
10
11        return true;
12    }
13}