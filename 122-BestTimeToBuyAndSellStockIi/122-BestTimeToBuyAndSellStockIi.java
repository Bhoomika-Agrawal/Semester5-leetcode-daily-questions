// Last updated: 7/31/2025, 2:15:00 PM
class Solution {
    public int maxProfit(int[] prices) {
        return max(prices);
    }
    public static int max(int[] arr){
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
    }
}