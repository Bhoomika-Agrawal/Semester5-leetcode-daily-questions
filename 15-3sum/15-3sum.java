// Last updated: 7/31/2025, 2:16:15 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int start=i+1;
            int last=nums.length-1;
            while(start<last){
                int sum=nums[i]+nums[start]+nums[last];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[start],nums[last]));
                    while(start<last && nums[start]==nums[start+1]){
                        start++;
                    }
                    while(start<last && nums[last]==nums[last-1]){
                        last--;
                    }
                    start++;
                    last--;
                }
                else if(sum>0){
                    last--;
                }
                else{
                    start++;
                }
            }
        }
        return ans;
    }
}