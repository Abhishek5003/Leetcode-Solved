// Last updated: 8/10/2026, 9:02:09 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        int top = 0;
        int bot = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int d = 0;

        while(top <= bot && left <= right){
            if(d == 0){
                for(int i = left; i <= right;i++){
                    ans.add(matrix[top][i]);
                }
            
                top++;
                if (top > bot) break;
            }else if(d == 1){
                for(int i = top; i <= bot; i++){
                    ans.add(matrix[i][right]);
                }
                right--;
                if(left > right) break;
            }else if(d == 2){
                for(int i = right;i >= left; i--){
                ans.add(matrix[bot][i]);
                }
                bot--;
                if(bot < top) break;
            }else if(d == 3){
                for(int i = bot;i >= top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
                if(left > right) break;
            }           
            d = (d + 1) % 4;
        }
        
        return ans;
    }
}

