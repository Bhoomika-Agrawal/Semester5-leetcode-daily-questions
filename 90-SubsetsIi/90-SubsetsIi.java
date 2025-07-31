// Last updated: 7/31/2025, 2:15:07 PM
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>ll=new ArrayList<>();
        subset(nums,ll,ans,0);
        return ans;
    }
    public static void subset(int[] nums,List<Integer> ll,List<List<Integer>> ans,int idx){
        if(idx==nums.length){
            ans.add(new ArrayList<>(ll));
            return;
        }
        ll.add(nums[idx]);
        subset(nums,ll,ans,idx+1);
        while(idx+1<nums.length && nums[idx]==nums[idx+1]){
            idx++;
        }
        ll.remove(ll.size()-1);
        subset(nums,ll,ans,idx+1);
    }
}