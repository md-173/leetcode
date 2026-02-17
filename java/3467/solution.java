class Solution {
    public int[] transformArray(int[] nums) {
        int len = nums.length;
        int[] out = new int[len];
        int frontPtr = 0;
        int backPtr = len - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                out[frontPtr++] = 0; 
            }
            else {
                out[backPtr--] = 1;
            }
        }
        return out;
    }
}
