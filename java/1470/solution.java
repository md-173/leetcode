class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] output = new int[n*2];
        for (int i = 0; i < n; i++)
        {
            output[i*2] = nums[i];
        }
        for (int i = n; i < 2*n; i++)
        {
            output[(i - (n))*2 + 1] = nums[i];
        }

        return output;
    }
}
