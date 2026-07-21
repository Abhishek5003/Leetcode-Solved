// Last updated: 7/21/2026, 5:00:38 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i = 0;i < jewels.length();i++){
            for(int j = 0;j < stones.length();j++){
            if(jewels.charAt(i) == stones.charAt(j)) count++;
            }
        }
        return count;
    }
}