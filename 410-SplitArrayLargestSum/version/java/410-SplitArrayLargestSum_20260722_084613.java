// Last updated: 7/22/2026, 8:46:13 AM
/*
 * # LeetCode 410 - Split Array Largest Sum
 * 
 * Pattern:
 * - Binary Search on Answer
 * 
 * Search Space:
 * - Low = max element (or 0 if deriving yourself, but max element is the optimal lower bound)
 * - High = sum of all elements
 * 
 * Observation:
 * - Answer lies between max(nums) and sum(nums).
 * 
 * Validation:
 * - Greedily create subarrays such that each subarray sum <= mid.
 * - Count how many subarrays (students) are required.
 * - If required subarrays <= k, then mid is valid.
 * - Otherwise, mid is too small.
 * 
 * Binary Search:
 * - Valid -> search left (smaller answer)
 * - Invalid -> search right (larger answer)
 * 
 * Mistakes I made:
 * - Used `if(k > n)` instead of `if(k > nums.length)`.
 * - Forgot that `n` was the last index, not the number of elements.
 * 
 * Time Complexity:
 * - O(n * log(sum))
 * 
 * Related Problems:
 * - Allocate Minimum Number of Pages
 * - Capacity To Ship Packages Within D Days
*/

1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int sum = 0;
4        int n = nums.length - 1;
5
6        if (k > nums.length) return -1;
7
8        for (int i = 0; i <= n; i++) sum += nums[i];
9
10        int st = 0;
11        int end = sum;
12        int ans = -1;
13
14        while (st <= end) {
15            int mid = st + (end - st) / 2;
16
17            if (isValid(nums, mid, n, k)) {
18                ans = mid;
19                end = mid - 1;
20            } else {
21                st = mid + 1;
22            }
23        }
24
25        return ans;
26    }
27
28    public boolean isValid(int arr[], int mid, int n, int m) {
29        int stu = 1, pages = 0;
30
31        for (int i = 0; i <= n; i++) {
32            if (arr[i] > mid) return false;
33
34            if (pages + arr[i] <= mid) {
35                pages += arr[i];
36            } else {
37                stu++;
38                pages = arr[i];
39            }
40        }
41
42        if (stu > m) return false;
43
44        return true;
45    }
46}