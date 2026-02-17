class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int output = 0;
        for( char stone : stones.toCharArray()) {
            if (jewels.indexOf(stone) != -1) {
                output++;
            }
        }
        return output;
    }
}
