// Last updated: 8/10/2026, 9:01:13 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0; 
        int j = nums.length-1;
        int[] ans = new int[2];
        while(i < j){
            int sum = (nums[i] + nums[j]);
            if(sum == target) {
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }

            if(sum > target){
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }
}