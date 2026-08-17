// Last updated: 8/17/2026, 9:15:11 PM
/*
 * 📝 Brute Force Approach
 * 
 * Idea:
 * - Check every subarray of size k.
 * - Calculate its sum and average.
 * - Keep track of the maximum average.
 * 
 * Algorithm:
 * 1. Traverse all possible starting indices.
 * 2. For each index, calculate the sum of the next k elements.
 * 3. Compute average = (double) sum / k.
 * 4. Update the maximum average.
 * 5. Return the maximum average.
 * 
 * Time Complexity: O(n × k)
 * Space Complexity: O(1)
 * 
 * Key Learning:
 * - This approach recalculates the sum for every window, causing repeated work.
 * - Since the window size is fixed, the sum can be updated by removing the left element and adding the new right element instead of recomputing it. This leads to the Sliding Window approach with O(n) time complexity.
*/

1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int n = nums.length-1;
4        double max_avg = Double.NEGATIVE_INFINITY;
5        for(int i = 0; i <= (n-k)+1; i++){
6            int sum = 0;
7            for(int j = i; j <= (i+k)-1; j++){
8                sum = sum + nums[j];
9            }
10            double curr_avg = (double) sum/k;
11            max_avg = Math.max(curr_avg,max_avg);
12        }
13        return max_avg;
14    }
15}