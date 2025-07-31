// Last updated: 7/31/2025, 2:15:16 PM
class Solution {
    public boolean search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=e+((s-e)/2);
            if(target==nums[mid]){
                return true;
            }
            if (nums[s]==nums[mid] && nums[mid]==nums[e]) {
                s++;
                e--;
            }
            else if (nums[s]<=nums[mid]){//left array sorted
                if(nums[s]<=target && target<=nums[mid]){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[e]){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            } 
        }
         return false;
    }
}