// Last updated: 7/21/2026, 5:01:35 PM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}