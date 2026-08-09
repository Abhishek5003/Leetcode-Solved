// Last updated: 8/9/2026, 10:43:23 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        int i = 0;
6        int j = n-1;
7        int k = n-1;
8        while(i <= j){
9            int leftSquare = nums[i] * nums[i];
10            int rightSquare = nums[j] * nums[j];
11
12            if (leftSquare > rightSquare) {
13                ans[k] = leftSquare;
14                i++;
15            } else {
16                ans[k] = rightSquare;
17                j--;
18            }
19            k--;
20        }
21        return ans;
22    }
23}