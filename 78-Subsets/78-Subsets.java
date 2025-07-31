// Last updated: 7/31/2025, 2:15:21 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsets(nums,new ArrayList<>(),ans,0);
        return ans;
    }
    public static void subsets(int[] nums,List<Integer> ll,List<List<Integer>> ans,int idx){
        if(nums.length==idx){
            ans.add(new ArrayList<>(ll));
            return;
        }
        ll.add(nums[idx]);
        subsets(nums,ll,ans,idx+1);
        ll.remove(ll.size()-1);
        subsets(nums,ll,ans,idx+1);
    }
}