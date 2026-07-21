// Last updated: 7/21/2026, 5:02:05 PM
class Solution {
    public int[][] generateMatrix(int n) {
        int [][]matrix = new int[n][n];
        int top = 0;
        int left = 0;
        int right = matrix[0].length - 1;
        int bot = matrix.length - 1;
        int count = 1;
        int d = 0;
        while (top <= bot && left <= right) {
            if (d == 0) { // left -> right
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = count;
                    count++;
                }
                top++;
            }

             else if (d == 1) { // top -> bottom
                for (int i = top; i <= bot; i++) {
                    matrix[i][right] = count;
                    count++;
                }
                right--;
            }

            else if (d == 2) { // right -> left
                for (int i = right; i >= left; i--) {
                    matrix[bot][i] = count;
                    count++;
                }
                bot--;
            }

            else if (d == 3) { // bottom -> top
                for (int i = bot; i >= top; i--) {
                    matrix[i][left] = count;
                    count++;
                }
                left++;
            }

            d = (d+1) % 4;
        }

        return matrix;
    }
}