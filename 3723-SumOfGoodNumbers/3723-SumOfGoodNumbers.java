// Last updated: 7/31/2025, 2:10:51 PM
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int l=i-k;
            int r=i+k;
            boolean isgood=true;
            if(l>=0 && nums[i]<=nums[l]){
                isgood=false;
            }
            if(r<nums.length && nums[i]<=nums[r]){
                isgood=false;
            }
            if(isgood){
                sum+=nums[i];
            }
        }
        return sum;
    }
}