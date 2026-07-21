// Last updated: 7/21/2026, 5:01:09 PM
class Solution {
    public int missingNumber(int[] nums) {
        int sum_n = (nums.length*(nums.length + 1))/2;
        int sum_nums = 0;
        for(int i = 0; i < nums.length ; i++){
            sum_nums += nums[i];
        }

        return (sum_n - sum_nums);
    }
}

