// Last updated: 7/21/2026, 5:02:11 PM
class Solution {
    public void rotate(int[][] matrix) {
        // first 180 deg + transpose = result

        //180 deg
        int i = 0;
        int j = matrix.length -1;
        
        while(i<j){
            int x = 0;
            while(x < matrix[0].length){
                int temp = matrix[i][x];
                matrix[i][x] = matrix[j][x];
                matrix[j][x] = temp;
                x++;
            }
            i++;
            j--;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == cols) {
            // In-place transpose
            for (int k = 0; k < rows; k++) {
                for (int l = k + 1; l < cols; l++) {
                    int temp = matrix[k][l];
                    matrix[k][l] = matrix[l][k];
                    matrix[l][k] = temp;
                }
            }
        }
    }
}