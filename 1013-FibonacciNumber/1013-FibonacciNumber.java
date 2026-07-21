// Last updated: 7/21/2026, 5:00:18 PM
class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i = 0; i < n-1; i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
}