// Last updated: 7/21/2026, 4:59:49 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int st = 0;
        int end = nums.length - 1;
        int target = nums[(st + end)/ 2];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) count++;
        }
        if(count > 1) return false;
        return true;
    }
}