// Last updated: 7/30/2026, 6:59:14 AM
class Solution {
    public int maxProduct(int n) {
        int first = 0, second = 0;
        
        while(n > 0){
            int digit = n % 10;
            if(digit > first){
                second = first;
                first = digit;
            }else if(digit > second){
                second = digit;
            }
            n = n/10;
        }
        
        return first * second;
    }
}