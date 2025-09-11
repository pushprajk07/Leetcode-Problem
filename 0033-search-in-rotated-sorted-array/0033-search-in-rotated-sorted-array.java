class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // found
            }

            // Check if left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // target lies in left half
                } else {
                    left = mid + 1;  // search in right half
                }
            } 
            // Else, right half must be sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;  // target lies in right half
                } else {
                    right = mid - 1; // search in left half
                }
            }
        }
        return -1; // not found
    }
}
