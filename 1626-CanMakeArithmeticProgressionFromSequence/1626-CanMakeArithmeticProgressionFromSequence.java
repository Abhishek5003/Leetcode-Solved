// Last updated: 7/30/2026, 6:59:28 AM
class Solution {
    public boolean canMakeArithmeticProgression(int[] nums) {
        Arrays.sort(nums);
        int d = nums[1] - nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i-1] != d){
                return false;
            }
        }

        return true;
    }
}