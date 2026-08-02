// Last updated: 8/2/2026, 10:09:03 PM
1class Solution {
2    public int thirdMax(int[] nums) {
3        long first = Long.MIN_VALUE;
4        long second = Long.MIN_VALUE;
5        long third = Long.MIN_VALUE;
6
7        for (int i = 0; i < nums.length; i++) {
8
9    // Skip duplicates
10            if (nums[i] == first || nums[i] == second || nums[i] == third){
11                continue;
12            }
13
14            if (nums[i] > first) {
15                third = second;
16                second = first;
17                first = nums[i];
18
19            } else if (nums[i] > second) {
20
21                third = second;
22                second = nums[i];
23
24            } else if (nums[i] > third) {
25
26                third = nums[i];
27
28            }
29        }
30            
31        if (third == Long.MIN_VALUE){
32            return (int) first;
33        }else{
34            return (int) third;
35        }
36
37    }
38}