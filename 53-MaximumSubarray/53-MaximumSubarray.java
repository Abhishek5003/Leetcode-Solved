// Last updated: 7/21/2026, 5:02:15 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0]; 
        int cs = 0;
        
        for (int val : nums) {
            cs += val;
            if (cs > maxsum) 
                maxsum = cs;

            if (cs < 0) 
                cs = 0;
        }
        return maxsum;
    }
}
