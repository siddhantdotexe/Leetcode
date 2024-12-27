class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        count = 0;
        sum(nums, target, 0, 0); 
        return count;
    }

    static int count = 0;
    static void sum(int[] nums, int target, int currentSum, int index) {
        if (index == nums.length) {
            if (currentSum == target) {
                count++;
            }
            return;
        }
        sum(nums, target, currentSum + nums[index], index + 1);
        sum(nums, target, currentSum - nums[index], index + 1);
    }
}