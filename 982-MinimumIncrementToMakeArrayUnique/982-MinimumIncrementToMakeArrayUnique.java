// Last updated: 7/31/2025, 2:12:11 PM
class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int moves=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                moves+=nums[i-1]-nums[i]+1;
                nums[i]=nums[i-1]+1;
            }
        }
        return moves;
    }
}