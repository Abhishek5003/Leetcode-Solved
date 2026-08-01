// Last updated: 8/1/2026, 1:28:00 PM
1class Solution {
2    public int findNumbers(int[] nums) {
3        int evenCount = 0;
4        for(int i = 0; i < nums.length; i++){
5            int num = nums[i];
6            int count = 0;
7            while(num > 0){
8                num = num / 10;
9                count++;
10            }
11            if(count%2 == 0) evenCount++;
12        }
13        return evenCount;
14    }
15}