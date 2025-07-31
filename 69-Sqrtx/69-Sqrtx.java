// Last updated: 7/31/2025, 2:15:29 PM
class Solution {
    public int mySqrt(int x) {
        return kthroot(x);
    }
    public static int kthroot(int n) {
        int k=2;
		int lo=1;
		int hi=n;
		int ans=0;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(Math.pow(mid, k)<=n) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
			
		}
		return ans;
	}
}