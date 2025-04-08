class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Pointer to place the next non-zero element
        
        // Move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }
}
