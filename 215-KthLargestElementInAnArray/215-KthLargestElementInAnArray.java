// Last updated: 7/31/2025, 2:14:18 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=nums.length-k;
        return nums[ans];
    }
    
}