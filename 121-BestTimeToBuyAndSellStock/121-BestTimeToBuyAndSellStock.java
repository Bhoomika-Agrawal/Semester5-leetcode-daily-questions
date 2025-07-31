// Last updated: 7/31/2025, 2:15:02 PM
class Solution {
    public int maxProfit(int[] prices) {
        return buy(prices);
    }
    public static int buy(int[] arr){
        int max=0;
        int bestbuy=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>bestbuy){
                max=Math.max(max,arr[i]-bestbuy);
            }
            bestbuy=Math.min(bestbuy,arr[i]);
        }
        return max;
    }
}