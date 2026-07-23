// Last updated: 7/23/2026, 7:49:46 AM
/*
 * Pattern: Binary Search on Answer
 * 
 * Search Space:
 * st = max(weights)
 * end = sum(weights)
 * 
 * Observation:
 * - If a capacity works, then every larger capacity will also work.
 * - If a capacity doesn't work, every smaller capacity will also fail.
 * - Hence, binary search on the answer.
 * 
 * isValid():
 * - Traverse packages in order.
 * - Keep adding weights until capacity is exceeded.
 * - If exceeded, start a new day.
 * - Count the number of days required.
 * - Return true if daysRequired <= givenDays.
 * 
 * Time Complexity: O(n * log(sum(weights)))
 * Space Complexity: O(1)
 * 
 * Similar Problems:
 * - Book Allocation
 * - Painter's Partition
 * - LeetCode 410 - Split Array Largest Sum
*/

1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int sum = 0;
4        int n = weights.length - 1;
5
6        for (int i = 0; i <= n; i++) sum += weights[i];
7
8        int st = 0;
9        int end = sum;
10        int ans = -1;
11
12        while (st <= end) {
13            int mid = st + (end - st) / 2;
14
15            if (isValid(weights, mid, n, days)) {
16                ans = mid;
17                end = mid - 1;
18            } else {
19                st = mid + 1;
20            }
21        }
22
23        return ans;
24    }
25
26    public boolean isValid(int arr[], int mid, int n, int days) {
27        int day = 1, load = 0;
28
29        for (int i = 0; i <= n; i++) {
30            if (arr[i] > mid) return false;
31
32            if (load + arr[i] <= mid) {
33                load += arr[i];
34            } else {
35                day++;
36                load = arr[i];
37            }
38        }
39
40        return day <= days;
41    }
42}