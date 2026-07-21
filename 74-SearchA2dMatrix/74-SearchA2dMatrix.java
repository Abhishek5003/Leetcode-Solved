// Last updated: 7/21/2026, 5:01:59 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0; i < rows * cols; i++){
            if(matrix[i / cols][i % cols] == target){
                return true;
            }
        }

        return false;
    }
}