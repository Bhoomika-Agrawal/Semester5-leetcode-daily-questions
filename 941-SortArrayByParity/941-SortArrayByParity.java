// Last updated: 7/31/2025, 2:12:21 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]%2==1 && nums[j]%2==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            else if(nums[i]%2==0){
                i++;
            }
            else if(nums[j]%2==1){
                j--;
            }
        }
        return nums;
    }
}