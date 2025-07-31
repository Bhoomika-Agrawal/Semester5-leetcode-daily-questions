// Last updated: 7/31/2025, 2:13:02 PM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxsum=0;
        for(int i=0;i<nums.length;i+=2){
            maxsum+=nums[i];
        }
        return maxsum;
    }
}