// Last updated: 7/31/2025, 2:16:25 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        return Twosum(nums,target);
    }
    public static int[] Twosum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
    return nums;
    }
}