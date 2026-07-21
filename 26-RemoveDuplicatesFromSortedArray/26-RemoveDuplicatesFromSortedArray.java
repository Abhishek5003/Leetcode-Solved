// Last updated: 7/21/2026, 5:02:26 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int freq = 1;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] != nums[i - 1]){
                nums[freq] = nums[i];
                freq++;
            }
        }    
        return freq;    
    }
}