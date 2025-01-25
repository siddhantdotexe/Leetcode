class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int max = 1; 
        boolean hasZero = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                max *= nums[i];
            }else {
                if (hasZero) {
                    return new int[nums.length];
                }
                hasZero = true;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                if (hasZero) {
                    ans[j] = 0;
                } else {
                    ans[j] = max / nums[j];
                }
            } else {
                ans[j] = max;
            }
        }
        return ans;
    }
}
