class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n*(n+1))/2;
        for(int i : nums){
            totalSum = totalSum - i;
        }
        return totalSum;
    }
}