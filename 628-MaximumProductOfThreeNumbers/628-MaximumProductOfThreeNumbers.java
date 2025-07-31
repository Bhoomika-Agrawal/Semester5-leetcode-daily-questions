// Last updated: 7/31/2025, 2:12:56 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n - 1]*nums[n - 2]*nums[n - 3],nums[0]*nums[1]*nums[n - 1]);
    }
}