// Last updated: 9/1/2026, 11:36:34 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        String a = Integer.toString(x);
4        int st = 0 ;
5        int ed = a.length() -1 ;
6        while(st <= ed){
7            if(a.charAt(st) != a.charAt(ed)) return false;
8            st++;
9            ed--;
10        }
11        return true;
12    }
13}