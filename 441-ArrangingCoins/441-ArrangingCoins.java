// Last updated: 7/31/2025, 2:13:19 PM
class Solution {
    public int arrangeCoins(int n) {
        long start=1;
        long end=n;
        int ans=-1;
        while(start<=end){
            long mid=start+((end-start)/2);
            long sum=mid*(mid+1)/2;
            if(sum>n){
                end=mid-1;
            }
            else{
                ans=(int)mid;
                start=mid+1;
            }
        }
        return ans;
    }
}