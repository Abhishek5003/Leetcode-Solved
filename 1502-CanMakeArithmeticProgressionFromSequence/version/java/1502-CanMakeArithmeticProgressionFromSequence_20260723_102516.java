// Last updated: 7/23/2026, 10:25:16 AM
1class Solution {
2    public int pivotInteger(int n) {
3        int sum_first = 0;
4        int sum_last = 0;
5        for(int x = 1; x <= n; x++){
6            for(int i = 0; i <= x; i++){
7                sum_first += i;
8            }
9
10            for(int j = x; j <= n; j++){
11                sum_last += j;
12            }
13
14            if(sum_first == sum_last) return x;
15
16            sum_first = 0;
17            sum_last = 0;
18            
19
20        }
21        return -1;
22    }
23}