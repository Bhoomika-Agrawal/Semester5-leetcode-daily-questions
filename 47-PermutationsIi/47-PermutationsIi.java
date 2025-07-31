// Last updated: 7/31/2025, 2:15:46 PM
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] board=new boolean[nums.length];
        perm(board,nums,ans,ll);
        return ans;
    }
    public static void perm(boolean[] board,int[] nums,List<List<Integer>> ans,List<Integer> ll){
        if(ll.size()==nums.length){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && !board[i-1]) continue;
            if(board[i]==false){
                ll.add(nums[i]);
                board[i]=true;
                perm(board,nums,ans,ll);
                ll.remove(ll.size()-1);
                board[i]=false;
            }
        }
    }
}