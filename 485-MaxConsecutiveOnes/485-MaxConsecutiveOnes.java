// Last updated: 7/21/2026, 5:00:46 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int currfreq = 0;
        int maxfreq = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 1) {
                currfreq++;
                maxfreq = Math.max(maxfreq, currfreq);
            } 
            else {
                currfreq = 0;
            }
        }

        return maxfreq;
    }
}