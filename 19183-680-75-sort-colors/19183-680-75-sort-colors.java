class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int current = 0;
        
        while (current <= end) {
            if (nums[current] == 0) {
                swap(nums, start, current);
                start++;
                current++;
            } else if (nums[current] == 2) {
                swap(nums, current, end);
                end--;
            } else {
                current++;
            }
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
