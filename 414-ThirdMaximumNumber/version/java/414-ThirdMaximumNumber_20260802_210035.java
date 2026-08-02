// Last updated: 8/2/2026, 9:00:35 PM
1class Solution {
2    public int thirdMax(int[] nums) {
3
4        if (nums.length == 1) return nums[0];
5        if (nums.length == 2) return Math.max(nums[0], nums[1]);
6
7        Arrays.sort(nums);
8
9        List<Long> arr = new ArrayList<>();
10        arr.add((long) nums[0]);
11
12        for (int i = 1; i < nums.length; i++) {
13            if (nums[i] == nums[i - 1]) {
14                continue;
15            }
16            arr.add((long) nums[i]);
17        }
18
19        if (arr.size() < 3) {
20            return arr.get(arr.size() - 1).intValue();
21        }
22
23        return arr.get(arr.size() - 3).intValue();
24    }
25}