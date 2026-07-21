// Last updated: 7/21/2026, 5:00:42 PM
class Solution {
    public int distributeCandies(int[] Type) {
        Arrays.sort(Type);
        int n = Type.length/2;
        int count = 1;
        for(int i = 1; i < Type.length; i++){
            if(Type[i] != Type[i-1]){
                count++;
            }
        }
    
        return Math.min(n,count);
    }
}