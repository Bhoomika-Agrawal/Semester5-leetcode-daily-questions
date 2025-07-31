// Last updated: 7/31/2025, 2:12:03 PM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int s=max;
        int e=sum;
        int ans=-1;
        while(s<=e){
            int mid=s+((e-s)/2);
            if(possible(weights,mid,days)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    public static boolean possible(int[] arr,int mid,int days){
        int d=1;
        int w=0;
        for(int i=0;i<arr.length;i++){
            if(w+arr[i]<=mid){
                w+=arr[i];
            }
            else{
                d++;
                w=arr[i];
            }
        }
        return d<=days;
    }
}