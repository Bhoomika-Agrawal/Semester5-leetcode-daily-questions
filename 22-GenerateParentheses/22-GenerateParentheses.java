// Last updated: 7/31/2025, 2:16:09 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ll=new ArrayList<>();
		paren(n,0,0,"",ll);
		return ll;
    }
    public static void paren(int n,int closed,int open,String ans,List<String> ll) {
		if(open == n && closed == n) {
//			System.out.println(ans);
			ll.add(ans);
			return;
		}
		if(open>n || closed>open) {
			return;
		}
		paren(n,closed,open+1,ans+"(",ll);
		paren(n,closed+1,open,ans+")",ll);
	}
}