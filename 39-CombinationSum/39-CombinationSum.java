// Last updated: 7/31/2025, 2:15:53 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
		List<Integer> ll =new ArrayList<>();
		combination(candidates,target,ll,0,ans);
        return ans;
    }
    public static void combination(int[] coin,int amount,List<Integer> ll,int idx,List<List<Integer>> ans) {
		if(amount==0) {
//			System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i=idx;i<coin.length;i++) {
			if(amount>=coin[i]) {
				ll.add(coin[i]);
				combination(coin,amount-coin[i],ll,i,ans);
				ll.remove(ll.size()-1);
			}
		}
	}
}