// Last updated: 8/10/2026, 8:54:12 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int i = 0; 
4        int j = nums.length-1;
5        int[] ans = new int[2];
6        while(i < j){
7            int sum = (nums[i] + nums[j]);
8            if(sum == target) {
9                ans[0] = i+1;
10                ans[1] = j+1;
11                break;
12            }
13
14            if(sum > target){
15                j--;
16            }else{
17                i++;
18            }
19        }
20        return ans;
21    }
22}