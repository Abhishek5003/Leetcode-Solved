// Last updated: 7/31/2026, 9:22:50 PM
1class Solution {
2    public int[] runningSum(int[] nums) {
3       int sum = nums[0];
4       for(int i = 1; i < nums.length; i++){
5          nums[i] = nums[i] + sum;
6          sum = nums[i];
7       }
8       return nums;
9    }
10}