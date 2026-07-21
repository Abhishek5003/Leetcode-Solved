// Last updated: 7/21/2026, 5:02:02 PM
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        bool ispresent = false;
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix[i].size(); j++) {     
                if(matrix[i][j] == target){
                    ispresent = true;
                    return ispresent;
                }
            }
        }
        return ispresent;
    }
};