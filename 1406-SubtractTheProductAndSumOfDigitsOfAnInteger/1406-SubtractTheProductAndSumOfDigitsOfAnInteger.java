// Last updated: 7/21/2026, 5:00:09 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int mul = 1;
        int sum = 0;
        
        while(n > 0){
            int digit = n % 10;
            mul = mul * digit;
            sum = sum + digit;
            n = n / 10;
        }
        
        return mul - sum;
    }
}