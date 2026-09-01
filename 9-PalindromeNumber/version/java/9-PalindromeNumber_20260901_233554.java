// Last updated: 9/1/2026, 11:35:54 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        int temp = x;
4        int reverse = 0;
5        while(temp > 0){
6            int num = temp%10;
7            reverse = reverse*10 + num;
8            temp = temp/10;
9        }
10        int xor = reverse ^ x;
11        if(xor == 0){
12            return true;
13        }
14        return false;
15    }
16}