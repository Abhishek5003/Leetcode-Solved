// Last updated: 9/5/2026, 7:37:12 PM
/*
 * # LeetCode 560 - Subarray Sum Equals K (Prefix Sum + HashMap)
 * 
 * ## Intuition
 * Instead of checking every subarray (`O(n²)`), use Prefix Sum + HashMap.
 * 
 * If:
 * ```
 * currentPrefixSum - previousPrefixSum = k
 * ```
 * 
 * Then:
 * ```
 * previousPrefixSum = currentPrefixSum - k
 * ```
 * 
 * So, while traversing, check whether `(currentPrefixSum - k)` has appeared before.
 * 
 * ---
 * 
 * ## Prefix Sum
 * ```
 * prefixSum[i] = arr[0] + arr[1] + ... + arr[i]
 * ```
 * 
 * Example:
 * ```
 * arr = [1, 2, 3]
 * 
 * prefixSum = [1, 3, 6]
 * ```
 * 
 * ---
 * 
 * ## HashMap
 * ```
 * Key   -> Prefix Sum
 * Value -> Frequency
 * ```
 * 
 * Example:
 * ```
 * {1=1, 3=2, 6=1}
 * ```
 * 
 * ---
 * 
 * ## Algorithm
 * 1. Build the Prefix Sum array.
 * 2. Traverse each prefix sum.
 * 3. If `prefixSum == k`, increment answer.
 * 4. Compute:
 *    ```
 *    val = prefixSum - k
 *    ```
 * 5. If `val` exists in the map:
 *    ```
 *    count += map.get(val);
 *    ```
 * 6. Store/update the current prefix sum frequency:
 *    ```
 *    map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
 *    ```
 * 7. Return `count`.
 * 
 * ---
 * 
 * ## Why Frequency?
 * The same prefix sum may occur multiple times.
 * 
 * Example:
 * ```
 * Prefix Sums:
 * 2, 4, 2, 5
 * 
 * Map:
 * 2 -> 2
 * ```
 * 
 * If:
 * ```
 * val = 2
 * ```
 * 
 * Then **both occurrences** can form valid subarrays.
 * 
 * So:
 * ```
 * count += map.get(2);
 * ```
 * 
 * ---
 * 
 * ## Complexity
 * ```
 * Time  : O(n)
 * Space : O(n)
 * ```
 * 
 * ---
 * 
 * ## Key Formula
 * ```
 * Subarray Sum = Current Prefix Sum - Previous Prefix Sum
 * ```
 * 
 * Rearranging:
 * ```
 * Previous Prefix Sum = Current Prefix Sum - k
 * ```
 * 
 * This is the value we search in the HashMap.
*/

1import java.util.HashMap;
2
3class Solution {
4    public int subarraySum(int[] arr, int k) {
5
6        int n = arr.length;
7        int count = 0;
8        int[] prefixSum = new int[n];
9
10        prefixSum[0] = arr[0];
11
12        for (int i = 1; i < n; i++) {
13            prefixSum[i] = prefixSum[i - 1] + arr[i];
14        }
15
16        HashMap<Integer, Integer> map = new HashMap<>();
17
18        for (int j = 0; j < n; j++) {
19
20            if (prefixSum[j] == k)
21                count++;
22
23            int val = prefixSum[j] - k;
24
25            if (map.containsKey(val))
26                count += map.get(val);
27
28            map.put(prefixSum[j], map.getOrDefault(prefixSum[j], 0) + 1);
29        }
30
31        return count;
32    }
33}