class Solution {
    public int[] buildArray(int[] nums) {
        int[] copyArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            copyArr[i] = nums[nums[i]];
        }
        return copyArr;
    }
}
