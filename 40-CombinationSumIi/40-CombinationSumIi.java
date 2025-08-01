// Last updated: 7/31/2025, 2:15:51 PM
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
		List<Integer> ll =new ArrayList<>();
        Arrays.sort(candidates);
		combination(candidates,target,ll,0,ans);
        return ans;
    }
    public static void combination(int[] coin,int amount,List<Integer> ll,int idx,List<List<Integer>> ans){
        if(amount==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<coin.length;i++){
            if(i>idx && coin[i]==coin[i-1]){
                continue;
            }
            if(amount<coin[i]){
                break;
            }
            ll.add(coin[i]);
            combination(coin,amount-coin[i],ll,i+1,ans);
            ll.remove(ll.size()-1);
        }
    }
}