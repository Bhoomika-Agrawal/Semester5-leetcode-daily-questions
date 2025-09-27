// Last updated: 9/27/2025, 2:50:21 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int max=piles[0];
        for(int i=1;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int hi=max;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+((hi-lo)/2);
            if(possible(piles,mid,h)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public static boolean possible(int[] arr,int k,int h){
        long total_hour=0;
        for(int i=0;i<arr.length;i++){
            total_hour+=(arr[i]+k-1)/k;
            if(total_hour>h){
                return false;
            }
        }
        return true;
    }
}
