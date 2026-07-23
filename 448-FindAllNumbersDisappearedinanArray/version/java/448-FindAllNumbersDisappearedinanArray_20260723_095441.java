// Last updated: 7/23/2026, 9:54:41 AM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3    Arrays.sort(nums);
4    List<Integer> numbers = new ArrayList<>();
5
6    int expected = 1;
7
8    for (int i = 0; i < nums.length; i++) {
9        if (nums[i] < expected) continue; // duplicate
10
11        while (expected < nums[i]) {
12            numbers.add(expected);
13            expected++;
14        }
15
16        expected++;
17    }
18
19    while (expected <= nums.length) {
20        numbers.add(expected);
21        expected++;
22    }
23
24    return numbers;
25}
26}