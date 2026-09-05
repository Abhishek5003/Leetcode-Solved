// Last updated: 9/5/2026, 7:36:55 PM
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