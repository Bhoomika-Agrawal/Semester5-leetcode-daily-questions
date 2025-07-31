// Last updated: 7/31/2025, 2:16:07 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        return remove(nums);
    }
    public static int remove(int[] nums){
        if(nums.length<=1){
            return nums.length;
        }
        int index=1;;
        for(int i=1;i<nums.length;i++){
            if(nums[index-1]!=nums[i]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}