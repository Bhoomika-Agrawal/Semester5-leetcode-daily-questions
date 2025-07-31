// Last updated: 7/31/2025, 2:13:15 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List <Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int ele=Math.abs(nums[i])-1;
            if(nums[ele]>0){
                nums[ele]=-nums[ele];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    }

}