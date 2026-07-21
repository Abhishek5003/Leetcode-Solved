// Last updated: 7/21/2026, 5:01:29 PM
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        
        while(s.add(n)){
            if(n == 1) return true;
            int sum = 0;
            while(n != 0){
                int rem = n%10;
                sum += rem*rem;
                n = n/10;
            }
            n = sum;
        }
        return false;
    }
}