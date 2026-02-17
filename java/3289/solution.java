class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] amounts = new int[nums.length - 2];
        Arrays.fill(amounts, 0);
        int[] out = new int[2];
        int idx = 0;

        for(int i = 0; i < nums.length; i++) {
            amounts[nums[i]] += 1;
            if(amounts[nums[i]] == 2){
                out[idx] = nums[i];
                amounts[nums[i]] -= 1;
                idx++;
            }
            if(idx == 2) {
                return out;
            }
        }
        return out;
    }
}
