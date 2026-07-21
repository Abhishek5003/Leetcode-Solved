// Last updated: 7/21/2026, 5:00:41 PM
class Solution {
    public int[] findErrorNums(int[] nums) {

        int[] ans = new int[2];
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++) {

            // duplicate
            if(nums[i] == nums[i-1]) {
                ans[0] = nums[i];
            }

            // missing number
            else if(nums[i] - nums[i-1] > 1) {
                ans[1] = nums[i-1] + 1;
            }
        }

        // edge case: missing at beginning
        if(nums[0] != 1)
            ans[1] = 1;

        // edge case: missing at end
        if(nums[nums.length - 1] != nums.length)
            ans[1] = nums.length;

        return ans;
    }
}