// Last updated: 7/21/2026, 5:00:27 PM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == cols) {
            // In-place transpose
            for (int i = 0; i < rows; i++) {
                for (int j = i + 1; j < cols; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            return matrix;
        } else {
            // Create a new transposed matrix
            int[][] transpose = new int[cols][rows];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }
            return transpose;
        }
    }
}