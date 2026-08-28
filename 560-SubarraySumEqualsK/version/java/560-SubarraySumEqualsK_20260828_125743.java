// Last updated: 8/28/2026, 12:57:43 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int count = 0;
4        for(int i = 0; i < nums.length; i++){
5            int sum = 0;
6            for(int j = i; j < nums.length; j++){
7                sum = sum + nums[j];
8                if(sum == k) count++;
9            }
10        }
11        return count;
12    }
13}