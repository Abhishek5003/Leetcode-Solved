// Last updated: 7/21/2026, 5:00:02 PM
import java.util.*;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int n = nums.length;
        int[][] arr = new int[n][2]; // value + original index

        // store value and index
        for(int i = 0; i < n; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // sort by value
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int[] ans = new int[n];

        for(int i = 0; i < n; i++){

            // handle duplicates
            if(i > 0 && arr[i][0] == arr[i-1][0]){
                ans[arr[i][1]] = ans[arr[i-1][1]];
            } else {
                ans[arr[i][1]] = i;
            }
        }

        return ans;
    }
}