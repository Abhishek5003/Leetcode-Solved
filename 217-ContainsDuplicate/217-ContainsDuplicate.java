// Last updated: 7/21/2026, 5:01:25 PM
class Solution {
    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        int freq = 1;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] == nums[i-1]){
                freq++;
                if(freq >= 2){
                    return true;
                }
            }else{
                freq = 1;
            }
        }
        return false;
    }
}