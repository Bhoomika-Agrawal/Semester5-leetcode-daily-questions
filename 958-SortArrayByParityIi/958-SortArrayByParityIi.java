// Last updated: 7/31/2025, 2:12:14 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] e=new int[nums.length/2];
        int[] o=new int[nums.length/2];
        int eidx=0,oidx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                e[eidx]=nums[i];
                eidx++;
            }
            else{
                o[oidx++]=nums[i];
            }
        }
        int e_idx=0,o_idx=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=e[e_idx++];
            }
            else{
                nums[i]=o[o_idx++];
            }
        }
        return nums;
    }
}