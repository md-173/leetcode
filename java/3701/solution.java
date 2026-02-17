class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0;
        int alt = 1;
        for(int num : nums) {
            sum += alt * num;
            alt *= (-1);
        }
        return sum;
    }
}
