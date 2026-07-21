// Last updated: 7/21/2026, 5:01:47 PM
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int n = nums.size();
        int unique = 0;
        for(int i = 0; i < n; i++ ){
            unique = unique ^ nums[i];
        }
        return unique;
    }
};