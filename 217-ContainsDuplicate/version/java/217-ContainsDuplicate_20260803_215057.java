// Last updated: 8/3/2026, 9:50:57 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for(int num : nums){
5            if(set.contains(num)) return true;
6            set.add(num);
7        }
8        return false;
9    }
10}