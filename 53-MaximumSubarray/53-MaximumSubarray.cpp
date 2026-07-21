// Last updated: 7/21/2026, 5:02:21 PM
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int cs = 0, maxsum = INT_MIN;
        for(int val : nums){
            cs += val;
            maxsum = max( cs , maxsum );
            if( cs < 0){
                cs = 0;
            }
        }
        return maxsum;
    }
};