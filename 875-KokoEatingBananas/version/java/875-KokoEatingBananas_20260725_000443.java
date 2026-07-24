// Last updated: 7/25/2026, 12:04:43 AM
/*
 * Pattern: Binary Search on Answer
 * 
 * Search Space:
 * st = 1
 * end = max(piles)
 * 
 * Observation:
 * - If Koko can finish all bananas at speed k, then she can also finish at any speed > k.
 * - If speed k is not enough, every smaller speed will also fail.
 * - Hence, binary search on the answer.
 * 
 * isValid():
 * - For each pile, calculate hours required:
 *   hours += ceil(pile / speed)
 * - In integer math:
 *   hours += (pile + speed - 1) / speed
 * - Return true if totalHours <= h.
 * 
 * Time Complexity: O(n * log(max(piles)))
 * Space Complexity: O(1)
 * 
 * Key Difference:
 * - Book Allocation / Painter / 410 / 1011:
 *   - st = max(arr)
 *   - end = sum(arr)
 *   - Greedy partition
 * 
 * - Koko (875):
 *   - st = 1
 *   - end = max(arr)
 *   - Count total hours using ceil(pile / speed)
 * 
 * Similar Problems:
 * - 410. Split Array Largest Sum
 * - 1011. Capacity To Ship Packages Within D Days
 * - Book Allocation
 * - Painter's Partition
*/

1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3
4        int n = piles.length;
5        int st = 1;
6        int end = 0;
7
8        for (int i = 0; i < n; i++) {
9            end = Math.max(end, piles[i]);
10        }
11
12        int ans = -1;
13
14        while (st <= end) {
15
16            int mid = st + (end - st) / 2;
17
18            if (isValid(piles, mid, n, h)) {
19                ans = mid;
20                end = mid - 1;
21            } else {
22                st = mid + 1;
23            }
24        }
25
26        return ans;
27    }
28
29    public boolean isValid(int arr[], int mid, int n, int h) {
30
31        int hours = 0;
32
33        for (int i = 0; i < n; i++) {
34
35            hours += (arr[i] + mid - 1) / mid; // ceil(arr[i] / mid)
36
37            if (hours > h) {
38                return false;
39            }
40        }
41
42        return true;
43    }
44}