class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] concat = new int[n * 2];
        
        System.arraycopy(nums, 0, concat, 0, n);
        System.arraycopy(nums, 0, concat, n, n);

        return concat;
    }
}
