// Last updated: 8/1/2026, 1:35:01 PM
1class Solution {
2    public int findNumbers(int[] nums) {
3        if(nums.length == 0) return 0;
4        int evenCount = 0;
5        for(int number : nums)
6            if((int)Math.log10(number)%2 != 0)
7                evenCount++;
8            
9        
10        return evenCount;
11    }
12}